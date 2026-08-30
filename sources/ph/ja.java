package ph;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class ja {
    public int f41792a;
    public boolean f41793b;
    public ma f41794c;
    public String d;
    public long e;
    public long f41795f;
    public float f41796g;
    public float h;
    public float f41797i;
    public final RectF f41798j = new RectF();
    public final org.telegram.ui.Components.z5 f41799k;
    public final oa f41800l;

    public ja(oa oaVar) {
        this.f41800l = oaVar;
        this.f41799k = new org.telegram.ui.Components.z5(oaVar, 360L, nr.h);
    }

    public static void a(ja jaVar, boolean z4) {
        oa oaVar = jaVar.f41800l;
        if (oaVar.getMeasuredWidth() > 0) {
            ma maVar = jaVar.f41794c;
            if (maVar == null || z4) {
                Long l10 = null;
                if (maVar != null) {
                    maVar.b();
                    jaVar.f41794c = null;
                }
                oa oaVar2 = jaVar.f41800l;
                boolean z10 = jaVar.f41793b;
                String str = jaVar.d;
                int i10 = oaVar2.f42113s1;
                int i11 = oaVar2.f42119v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = jaVar.e;
                if (j10 > 2) {
                    l10 = Long.valueOf(j10);
                }
                jaVar.f41794c = new ma(oaVar2, z10, str, i12, dp, l10, oaVar.getMaxScrollDuration(), oaVar.W0, oaVar.X0, new ga(jaVar, 1));
            }
        }
    }

    public static void b(ja jaVar) {
        oa oaVar = jaVar.f41800l;
        int i10 = jaVar.f41792a;
        if (i10 >= 0) {
            ArrayList arrayList = oaVar.f42108r;
            if (i10 < arrayList.size()) {
                ha haVar = (ha) arrayList.get(jaVar.f41792a);
                if (oaVar.getMeasuredWidth() > 0 && haVar == null) {
                    if (haVar != null) {
                        haVar.a();
                    }
                    arrayList.set(jaVar.f41792a, new ha(oaVar, jaVar.d, (oaVar.getMeasuredWidth() - oaVar.getPaddingLeft()) - oaVar.getPaddingRight()));
                }
            }
        }
    }
}
