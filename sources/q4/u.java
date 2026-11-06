package q4;

import a8.p0;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
public final class u {
    public static final Object f53692b = new Object();
    public static volatile u f53693c;
    public Object f53694a;

    public static u a(Context context) {
        u uVar;
        synchronized (f53692b) {
            try {
                if (f53693c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    j2.n nVar = new j2.n(25, false);
                    nVar.f16453b = applicationContext;
                    nVar.f16454c = applicationContext.getContentResolver();
                    obj.f53694a = nVar;
                    f53693c = obj;
                }
                uVar = f53693c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public boolean b(r rVar) {
        j2.n nVar = (j2.n) this.f53694a;
        t tVar = rVar.f53688a;
        Context context = (Context) nVar.f16453b;
        int i7 = tVar.f53691c;
        String str = tVar.f53689a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i10 < 28) {
                        i7 = applicationInfo.uid;
                    }
                    if (i7 != 1000 && i7 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar.f53690b, tVar.f53691c) != 0 && !nVar.h0(tVar, "android.permission.STATUS_BAR_SERVICE") && !nVar.h0(tVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) nVar.f16454c, "enabled_notification_listeners");
                        if (string != null) {
                            for (String str2 : string.split(":")) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            h2.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, Bitmap bitmap) {
        Integer num = (Integer) i.f53663c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f53694a).putParcelable(str, bitmap);
    }

    public void d(long j3, String str) {
        Integer num = (Integer) i.f53663c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f53694a).putLong(str, j3);
    }

    public void e(String str, y yVar) {
        Rating rating;
        float f10 = yVar.f53710b;
        int i7 = yVar.f53709a;
        Integer num = (Integer) i.f53663c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f53694a;
        if (yVar.f53711c == null) {
            if (yVar.b()) {
                boolean z9 = true;
                switch (i7) {
                    case 1:
                        if (i7 != 1 || f10 != 1.0f) {
                            z9 = false;
                        }
                        yVar.f53711c = Rating.newHeartRating(z9);
                        break;
                    case 2:
                        if (i7 != 2 || f10 != 1.0f) {
                            z9 = false;
                        }
                        yVar.f53711c = Rating.newThumbRating(z9);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        yVar.f53711c = Rating.newStarRating(i7, yVar.a());
                        break;
                    case 6:
                        yVar.f53711c = Rating.newPercentageRating((i7 == 6 && yVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            yVar.f53711c = Rating.newUnratedRating(i7);
        }
        rating = yVar.f53711c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f53663c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f53694a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f53663c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f53694a).putCharSequence(str, charSequence);
    }
}
