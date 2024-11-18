package water.or.gbcreator.config

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.annotations.HUD
import cc.polyfrost.oneconfig.config.data.Mod
import cc.polyfrost.oneconfig.config.data.ModType
import water.or.gbcreator.Tags
import water.or.gbcreator.blocks.BlockCtrl

class GBCConfig : Config(Mod(Tags.MOD_NAME, ModType.SKYBLOCK), Tags.MOD_ID + ".json") {
        init {
                initialize()
        }
        
        @HUD(name = "State HUD") val hudState = HudState()
        
        override fun save() {
                super.save()
                BlockCtrl.refresh(enabled)
        }
        
        override fun load() {
                super.load()
                BlockCtrl.refresh(enabled)
        }
}