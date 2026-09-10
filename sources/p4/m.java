package p4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public final class m {
    public final Bundle f39738a;

    public m(Bundle bundle) {
        this.f39738a = bundle;
    }

    public final HashSet a() {
        Bundle bundle = this.f39738a;
        if (!bundle.containsKey("allowedPackages")) {
            return new HashSet();
        }
        return new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    public final ArrayList b() {
        Bundle bundle = this.f39738a;
        if (!bundle.containsKey("controlFilters")) {
            return new ArrayList();
        }
        return new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    public final ArrayList c() {
        Bundle bundle = this.f39738a;
        if (!bundle.containsKey("groupMemberIds")) {
            return new ArrayList();
        }
        return new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    public final String d() {
        return this.f39738a.getString("id");
    }

    public final boolean e() {
        if (!TextUtils.isEmpty(d()) && !TextUtils.isEmpty(this.f39738a.getString("name")) && !b().contains(null)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Uri parse;
        StringBuilder sb2 = new StringBuilder("MediaRouteDescriptor{ id=");
        sb2.append(d());
        sb2.append(", groupMemberIds=");
        sb2.append(c());
        sb2.append(", name=");
        Bundle bundle = this.f39738a;
        sb2.append(bundle.getString("name"));
        sb2.append(", description=");
        sb2.append(bundle.getString("status"));
        sb2.append(", iconUri=");
        String string = bundle.getString("iconUri");
        if (string == null) {
            parse = null;
        } else {
            parse = Uri.parse(string);
        }
        sb2.append(parse);
        sb2.append(", isEnabled=");
        sb2.append(bundle.getBoolean("enabled", true));
        sb2.append(", isSystemRoute=");
        sb2.append(bundle.getBoolean("isSystemRoute", false));
        sb2.append(", connectionState=");
        sb2.append(bundle.getInt("connectionState", 0));
        sb2.append(", controlFilters=");
        sb2.append(Arrays.toString(b().toArray()));
        sb2.append(", playbackType=");
        sb2.append(bundle.getInt("playbackType", 1));
        sb2.append(", playbackStream=");
        sb2.append(bundle.getInt("playbackStream", -1));
        sb2.append(", deviceType=");
        sb2.append(bundle.getInt("deviceType"));
        sb2.append(", volume=");
        sb2.append(bundle.getInt("volume"));
        sb2.append(", volumeMax=");
        sb2.append(bundle.getInt("volumeMax"));
        sb2.append(", volumeHandling=");
        sb2.append(bundle.getInt("volumeHandling", 0));
        sb2.append(", presentationDisplayId=");
        sb2.append(bundle.getInt("presentationDisplayId", -1));
        sb2.append(", extras=");
        sb2.append(bundle.getBundle("extras"));
        sb2.append(", isValid=");
        sb2.append(e());
        sb2.append(", minClientVersion=");
        sb2.append(bundle.getInt("minClientVersion", 1));
        sb2.append(", maxClientVersion=");
        sb2.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb2.append(", isVisibilityPublic=");
        sb2.append(bundle.getBoolean("isVisibilityPublic", true));
        sb2.append(", allowedPackages=");
        sb2.append(Arrays.toString(a().toArray()));
        sb2.append(" }");
        return sb2.toString();
    }
}
