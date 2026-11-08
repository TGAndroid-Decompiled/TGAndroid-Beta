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
    public static final Object f53810b = new Object();
    public static volatile u f53811c;
    public Object f53812a;

    public static u a(Context context) {
        u uVar;
        synchronized (f53810b) {
            try {
                if (f53811c == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    j2.n nVar = new j2.n(25, false);
                    nVar.f16456b = applicationContext;
                    nVar.f16457c = applicationContext.getContentResolver();
                    obj.f53812a = nVar;
                    f53811c = obj;
                }
                uVar = f53811c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public boolean b(r rVar) {
        j2.n nVar = (j2.n) this.f53812a;
        t tVar = rVar.f53806a;
        Context context = (Context) nVar.f16456b;
        int i7 = tVar.f53809c;
        String str = tVar.f53807a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i10 < 28) {
                        i7 = applicationInfo.uid;
                    }
                    if (i7 != 1000 && i7 != Process.myUid() && context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar.f53808b, tVar.f53809c) != 0 && !nVar.h0(tVar, "android.permission.STATUS_BAR_SERVICE") && !nVar.h0(tVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) nVar.f16457c, "enabled_notification_listeners");
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
        Integer num = (Integer) i.f53781c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f53812a).putParcelable(str, bitmap);
    }

    public void d(long j3, String str) {
        Integer num = (Integer) i.f53781c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f53812a).putLong(str, j3);
    }

    public void e(String str, y yVar) {
        Rating rating;
        float f10 = yVar.f53828b;
        int i7 = yVar.f53827a;
        Integer num = (Integer) i.f53781c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f53812a;
        if (yVar.f53829c == null) {
            if (yVar.b()) {
                boolean z9 = true;
                switch (i7) {
                    case 1:
                        if (i7 != 1 || f10 != 1.0f) {
                            z9 = false;
                        }
                        yVar.f53829c = Rating.newHeartRating(z9);
                        break;
                    case 2:
                        if (i7 != 2 || f10 != 1.0f) {
                            z9 = false;
                        }
                        yVar.f53829c = Rating.newThumbRating(z9);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        yVar.f53829c = Rating.newStarRating(i7, yVar.a());
                        break;
                    case 6:
                        yVar.f53829c = Rating.newPercentageRating((i7 == 6 && yVar.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            yVar.f53829c = Rating.newUnratedRating(i7);
        }
        rating = yVar.f53829c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.f53781c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f53812a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.f53781c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f53812a).putCharSequence(str, charSequence);
    }
}
