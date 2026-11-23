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
    public static final Object f55842b = new Object();
    public static volatile u f55843c;
    public Object f55844a;

    public static u a(Context context) {
        u uVar;
        synchronized (f55842b) {
            try {
                if (f55843c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    ji.k kVar = new ji.k(23, false);
                    kVar.f17942b = applicationContext;
                    kVar.f17943c = applicationContext.getContentResolver();
                    obj.f55844a = kVar;
                    f55843c = obj;
                }
                uVar = f55843c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public boolean b(r rVar) {
        ji.k kVar = (ji.k) this.f55844a;
        t tVar = rVar.f55838a;
        Context context = (Context) kVar.f17942b;
        int i7 = tVar.f55841c;
        String str = tVar.f55839a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i10 < 28) {
                        i7 = applicationInfo.uid;
                    }
                    if (i7 != 1000 && i7 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar.f55840b, tVar.f55841c) != 0 && !kVar.P(tVar, "android.permission.STATUS_BAR_SERVICE") && !kVar.P(tVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) kVar.f17943c, "enabled_notification_listeners");
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
        Integer num = (Integer) i.f55813c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f55844a).putParcelable(str, bitmap);
    }

    public void d(long j3, String str) {
        Integer num = (Integer) i.f55813c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f55844a).putLong(str, j3);
    }

    public void e(String str, y yVar) {
        Rating rating;
        float f10 = yVar.f55860b;
        int i7 = yVar.f55859a;
        Integer num = (Integer) i.f55813c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f55844a;
        if (yVar.f55861c == null) {
            if (yVar.b()) {
                boolean z10 = true;
                switch (i7) {
                    case 1:
                        if (i7 != 1 || f10 != 1.0f) {
                            z10 = false;
                        }
                        yVar.f55861c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i7 != 2 || f10 != 1.0f) {
                            z10 = false;
                        }
                        yVar.f55861c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        yVar.f55861c = Rating.newStarRating(i7, yVar.a());
                        break;
                    case 6:
                        yVar.f55861c = Rating.newPercentageRating((i7 == 6 && yVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            yVar.f55861c = Rating.newUnratedRating(i7);
        }
        rating = yVar.f55861c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f55813c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f55844a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f55813c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f55844a).putCharSequence(str, charSequence);
    }
}
