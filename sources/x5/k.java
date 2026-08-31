package x5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.tasks.Task;
import i9.u;
import j7.s7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l7.w0;
import m.e3;
import m.l1;
import m.q;
import r0.j0;
public final class k {
    public static k f50427e;
    public int f50428a;
    public final Object f50429b;
    public Object f50430c;
    public Object d;

    public k(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f50428a = i10;
        this.d = str;
        this.f50429b = arrayList;
        this.f50430c = arrayList2;
    }

    public static synchronized k d(Context context) {
        k kVar;
        synchronized (k.class) {
            try {
                if (f50427e == null) {
                    f50427e = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new u("MessengerIpcClient"))));
                }
                kVar = f50427e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    public void a() {
        ImageView imageView = (ImageView) this.f50429b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
                if (((e3) this.d) == null) {
                    this.d = new Object();
                }
                e3 e3Var = (e3) this.d;
                e3Var.f13184c = null;
                e3Var.f13183b = false;
                e3Var.d = null;
                e3Var.f13182a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    e3Var.f13183b = true;
                    e3Var.f13184c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    e3Var.f13182a = true;
                    e3Var.d = imageTintMode;
                }
                if (e3Var.f13183b || e3Var.f13182a) {
                    q.d(drawable, e3Var, imageView.getDrawableState());
                    return;
                }
            }
            e3 e3Var2 = (e3) this.f50430c;
            if (e3Var2 != null) {
                q.d(drawable, e3Var2, imageView.getDrawableState());
            }
        }
    }

    public String b(int i10, String str, long j10, long j11) {
        String[] strArr = (String[]) this.f50429b;
        String[] strArr2 = (String[]) this.d;
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f50428a;
            if (i11 < i12) {
                sb.append(strArr[i11]);
                int i13 = ((int[]) this.f50430c)[i11];
                if (i13 == 1) {
                    sb.append(str);
                } else if (i13 == 2) {
                    sb.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j10)));
                } else if (i13 == 3) {
                    sb.append(String.format(Locale.US, strArr2[i11], Integer.valueOf(i10)));
                } else if (i13 == 4) {
                    sb.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j11)));
                }
                i11++;
            } else {
                sb.append(strArr[i12]);
                return sb.toString();
            }
        }
    }

    public void c(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f50429b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f5692f;
        w0 y10 = w0.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y10.f12081c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) y10.f12081c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = s7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                l1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList r10 = y10.r(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(r10);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = l1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            y10.A();
        } catch (Throwable th2) {
            y10.A();
            throw th2;
        }
    }

    public synchronized Task e(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!((i) this.d).d(jVar)) {
                i iVar = new i(this);
                this.d = iVar;
                iVar.d(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.f50424b.getTask();
    }

    public k(Serializable serializable, Serializable serializable2, Serializable serializable3, int i10) {
        this.f50429b = serializable;
        this.f50430c = serializable2;
        this.d = serializable3;
        this.f50428a = i10;
    }

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new i(this);
        this.f50428a = 1;
        this.f50430c = scheduledExecutorService;
        this.f50429b = context.getApplicationContext();
    }

    public k(ImageView imageView) {
        this.f50428a = 0;
        this.f50429b = imageView;
    }
}
