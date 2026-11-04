package p4;

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
    public static final Object f53187b = new Object();
    public static volatile u f53188c;
    public Object f53189a;

    public static u a(Context context) {
        u uVar;
        synchronized (f53187b) {
            try {
                if (f53188c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    m2.t tVar = new m2.t(19, false);
                    tVar.f19006b = applicationContext;
                    tVar.f19007c = applicationContext.getContentResolver();
                    obj.f53189a = tVar;
                    f53188c = obj;
                }
                uVar = f53188c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public boolean b(r rVar) {
        m2.t tVar = (m2.t) this.f53189a;
        t tVar2 = rVar.f53183a;
        Context context = (Context) tVar.f19006b;
        int i3 = tVar2.f53186c;
        String str = tVar2.f53184a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i10 < 28) {
                        i3 = applicationInfo.uid;
                    }
                    if (i3 != 1000 && i3 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar2.f53185b, tVar2.f53186c) != 0 && !tVar.w0(tVar2, "android.permission.STATUS_BAR_SERVICE") && !tVar.w0(tVar2, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) tVar.f19007c, "enabled_notification_listeners");
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
            g2.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, Bitmap bitmap) {
        Integer num = (Integer) i.f53159c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f53189a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.f53159c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f53189a).putLong(str, j10);
    }

    public void e(String str, x xVar) {
        Rating rating;
        float f10 = xVar.f53204b;
        int i3 = xVar.f53203a;
        Integer num = (Integer) i.f53159c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f53189a;
        if (xVar.f53205c == null) {
            if (xVar.b()) {
                boolean z10 = true;
                switch (i3) {
                    case 1:
                        if (i3 != 1 || f10 != 1.0f) {
                            z10 = false;
                        }
                        xVar.f53205c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i3 != 2 || f10 != 1.0f) {
                            z10 = false;
                        }
                        xVar.f53205c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        xVar.f53205c = Rating.newStarRating(i3, xVar.a());
                        break;
                    case 6:
                        xVar.f53205c = Rating.newPercentageRating((i3 == 6 && xVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            xVar.f53205c = Rating.newUnratedRating(i3);
        }
        rating = xVar.f53205c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f53159c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f53189a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f53159c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f53189a).putCharSequence(str, charSequence);
    }
}
