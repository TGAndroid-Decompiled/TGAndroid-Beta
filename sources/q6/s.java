package q6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import c8.y9;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class s {
    public static final a0.l f53814a = new a0.l(0);
    public static Locale f53815b;

    public static String a(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(2131689564);
            case 2:
                return resources.getString(2131689571);
            case 3:
                return resources.getString(2131689561);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i7);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        String d = d(context);
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 5) {
                        if (i7 != 7) {
                            if (i7 != 9) {
                                if (i7 != 20) {
                                    switch (i7) {
                                        case 16:
                                            return e(context, "common_google_play_services_api_unavailable_text", d);
                                        case 17:
                                            return e(context, "common_google_play_services_sign_in_failed_text", d);
                                        case 18:
                                            return resources.getString(2131689572, d);
                                        default:
                                            return resources.getString(2131689567, d);
                                    }
                                }
                                return e(context, "common_google_play_services_restricted_profile_text", d);
                            }
                            return resources.getString(2131689568, d);
                        }
                        return e(context, "common_google_play_services_network_error_text", d);
                    }
                    return e(context, "common_google_play_services_invalid_account_text", d);
                }
                return resources.getString(2131689560, d);
            } else if (x6.b.f(context)) {
                return resources.getString(2131689573);
            } else {
                return resources.getString(2131689570, d);
            }
        }
        return resources.getString(2131689563, d);
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(2131689559);
            }
            return resources.getString(2131689569);
        }
        return resources.getString(2131689562);
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = z6.b.a(context).f2020a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f10 = f(context, str);
        if (f10 == null) {
            f10 = resources.getString(2131689567);
        }
        return String.format(resources.getConfiguration().locale, f10, str2);
    }

    public static String f(Context context, String str) {
        Resources resources;
        a0.l lVar = f53814a;
        synchronized (lVar) {
            try {
                Locale locale = y9.a(context.getResources().getConfiguration()).f20117a.get(0);
                if (!locale.equals(f53815b)) {
                    lVar.clear();
                    f53815b = locale;
                }
                String str2 = (String) lVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = n6.g.f20500a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 18);
                        sb2.append("Missing resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    } else {
                        String string = resources.getString(identifier);
                        if (TextUtils.isEmpty(string)) {
                            StringBuilder sb3 = new StringBuilder(str.length() + 20);
                            sb3.append("Got empty resource: ");
                            sb3.append(str);
                            Log.w("GoogleApiAvailability", sb3.toString());
                        } else {
                            lVar.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
