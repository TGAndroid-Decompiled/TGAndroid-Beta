package w7;

import android.net.Uri;
public abstract class h0 {
    public static Uri a(Uri uri) {
        if (uri.isHierarchical() && uri.getQueryParameter("CMCD") != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String str : uri.getQueryParameterNames()) {
                if (!str.equals("CMCD")) {
                    for (String str2 : uri.getQueryParameters(str)) {
                        buildUpon.appendQueryParameter(str, str2);
                    }
                }
            }
            return buildUpon.build();
        }
        return uri;
    }
}
