package qh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class ga {
    public int f45369a;
    public boolean f45370b;
    public ja f45371c;
    public String d;
    public long f45372e;
    public long f45373f;
    public float f45374g;
    public float h;
    public float f45375i;
    public final RectF f45376j = new RectF();
    public final org.telegram.ui.Components.z5 f45377k;
    public final la f45378l;

    public ga(la laVar) {
        this.f45378l = laVar;
        this.f45377k = new org.telegram.ui.Components.z5(laVar, 360L, pr.h);
    }

    public static void a(ga gaVar, boolean z4) {
        la laVar = gaVar.f45378l;
        if (laVar.getMeasuredWidth() > 0) {
            ja jaVar = gaVar.f45371c;
            if (jaVar == null || z4) {
                Long l10 = null;
                if (jaVar != null) {
                    jaVar.b();
                    gaVar.f45371c = null;
                }
                la laVar2 = gaVar.f45378l;
                boolean z10 = gaVar.f45370b;
                String str = gaVar.d;
                int i10 = laVar2.f45704s1;
                int i11 = laVar2.f45710v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = gaVar.f45372e;
                if (j10 > 2) {
                    l10 = Long.valueOf(j10);
                }
                gaVar.f45371c = new ja(laVar2, z10, str, i12, dp, l10, laVar.getMaxScrollDuration(), laVar.W0, laVar.X0, new u9(gaVar, 2));
            }
        }
    }

    public static void b(ga gaVar) {
        la laVar = gaVar.f45378l;
        int i10 = gaVar.f45369a;
        if (i10 >= 0) {
            ArrayList arrayList = laVar.f45699r;
            if (i10 < arrayList.size()) {
                ea eaVar = (ea) arrayList.get(gaVar.f45369a);
                if (laVar.getMeasuredWidth() > 0 && eaVar == null) {
                    if (eaVar != null) {
                        eaVar.a();
                    }
                    arrayList.set(gaVar.f45369a, new ea(laVar, gaVar.d, (laVar.getMeasuredWidth() - laVar.getPaddingLeft()) - laVar.getPaddingRight()));
                }
            }
        }
    }
}
