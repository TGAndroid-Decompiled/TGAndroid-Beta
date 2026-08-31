package qh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class ha {
    public int f45388a;
    public boolean f45389b;
    public ka f45390c;
    public String d;
    public long f45391e;
    public long f45392f;
    public float f45393g;
    public float h;
    public float f45394i;
    public final RectF f45395j = new RectF();
    public final org.telegram.ui.Components.z5 f45396k;
    public final ma f45397l;

    public ha(ma maVar) {
        this.f45397l = maVar;
        this.f45396k = new org.telegram.ui.Components.z5(maVar, 360L, pr.h);
    }

    public static void a(ha haVar, boolean z4) {
        ma maVar = haVar.f45397l;
        if (maVar.getMeasuredWidth() > 0) {
            ka kaVar = haVar.f45390c;
            if (kaVar == null || z4) {
                Long l10 = null;
                if (kaVar != null) {
                    kaVar.b();
                    haVar.f45390c = null;
                }
                ma maVar2 = haVar.f45397l;
                boolean z10 = haVar.f45389b;
                String str = haVar.d;
                int i10 = maVar2.f45730s1;
                int i11 = maVar2.f45736v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = haVar.f45391e;
                if (j10 > 2) {
                    l10 = Long.valueOf(j10);
                }
                haVar.f45390c = new ka(maVar2, z10, str, i12, dp, l10, maVar.getMaxScrollDuration(), maVar.W0, maVar.X0, new v9(haVar, 2));
            }
        }
    }

    public static void b(ha haVar) {
        ma maVar = haVar.f45397l;
        int i10 = haVar.f45388a;
        if (i10 >= 0) {
            ArrayList arrayList = maVar.f45725r;
            if (i10 < arrayList.size()) {
                fa faVar = (fa) arrayList.get(haVar.f45388a);
                if (maVar.getMeasuredWidth() > 0 && faVar == null) {
                    if (faVar != null) {
                        faVar.a();
                    }
                    arrayList.set(haVar.f45388a, new fa(maVar, haVar.d, (maVar.getMeasuredWidth() - maVar.getPaddingLeft()) - maVar.getPaddingRight()));
                }
            }
        }
    }
}
