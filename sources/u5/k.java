package u5;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import f9.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Components.i6;

public final class k {

    public static k f48420e;

    public int f48421a;

    public final Object f48422b;

    public final Object f48423c;
    public Object d;

    public k(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f48421a = i10;
        this.d = str;
        this.f48422b = arrayList;
        this.f48423c = arrayList2;
    }

    public static synchronized k b(Context context) {
        try {
            if (f48420e == null) {
                f48420e = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f48420e;
    }

    public String a(int i10, String str, long j10, long j11) {
        String[] strArr = (String[]) this.f48422b;
        String[] strArr2 = (String[]) this.d;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f48421a;
            if (i11 >= i12) {
                sb2.append(strArr[i12]);
                return sb2.toString();
            }
            sb2.append(strArr[i11]);
            int i13 = ((int[]) this.f48423c)[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, strArr2[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }

    public synchronized Task c(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!((i) this.d).d(jVar)) {
                i iVar = new i(this);
                this.d = iVar;
                iVar.d(jVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jVar.f48417b.getTask();
    }

    public k(Serializable serializable, Serializable serializable2, Serializable serializable3, int i10) {
        this.f48422b = serializable;
        this.f48423c = serializable2;
        this.d = serializable3;
        this.f48421a = i10;
    }

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new i(this);
        this.f48421a = 1;
        this.f48423c = scheduledExecutorService;
        this.f48422b = context.getApplicationContext();
    }

    public k() {
        i6 i6Var = new i6(true, true, true, false);
        this.d = i6Var;
        Paint paint = new Paint(1);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        paint.setColor(i0.b.k(-16777216, 58));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.f48422b = spannableStringBuilder;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.f48423c = spannableStringBuilder2;
        spannableStringBuilder2.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
    }
}
