package ml.denisd3d.mc2discord.core.config.core;

import com.electronwill.nightconfig.core.conversion.Path;
import com.electronwill.nightconfig.core.conversion.PreserveNotNull;
import ml.denisd3d.config4j.Comment;

public class General {
    @Path("token")
    @Comment("config.general.token.comment")
    @PreserveNotNull
    public String token = "";
}
