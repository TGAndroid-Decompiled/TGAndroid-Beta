package t5;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import e9.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.i6;
public final class l {
    public static l f47698e;
    public int f47699a;
    public final Object f47700b;
    public final Object f47701c;
    public Object d;

    public l(int i9, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f47699a = i9;
        this.d = str;
        this.f47700b = arrayList;
        this.f47701c = arrayList2;
    }

    public static synchronized l b(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f47698e == null) {
                    f47698e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v("MessengerIpcClient"))));
                }
                lVar = f47698e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public String a(int i9, String str, long j10, long j11) {
        String[] strArr = (String[]) this.f47700b;
        String[] strArr2 = (String[]) this.d;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = this.f47699a;
            if (i10 < i11) {
                sb2.append(strArr[i10]);
                int i12 = ((int[]) this.f47701c)[i10];
                if (i12 == 1) {
                    sb2.append(str);
                } else if (i12 == 2) {
                    sb2.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j10)));
                } else if (i12 == 3) {
                    sb2.append(String.format(Locale.US, strArr2[i10], Integer.valueOf(i9)));
                } else if (i12 == 4) {
                    sb2.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j11)));
                }
                i10++;
            } else {
                sb2.append(strArr[i11]);
                return sb2.toString();
            }
        }
    }

    public synchronized Task c(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.d).d(kVar)) {
                j jVar = new j(this);
                this.d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar.f47695b.getTask();
    }

    public l(Serializable serializable, Serializable serializable2, Serializable serializable3, int i9) {
        this.f47700b = serializable;
        this.f47701c = serializable2;
        this.d = serializable3;
        this.f47699a = i9;
    }

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new j(this);
        this.f47699a = 1;
        this.f47701c = scheduledExecutorService;
        this.f47700b = context.getApplicationContext();
    }

    public l() {
        i6 i6Var = new i6(true, true, true, false);
        this.d = i6Var;
        Paint paint = new Paint(1);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        paint.setColor(i0.a.k(-16777216, 58));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.f47700b = spannableStringBuilder;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.f47701c = spannableStringBuilder2;
        spannableStringBuilder2.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
    }
}
