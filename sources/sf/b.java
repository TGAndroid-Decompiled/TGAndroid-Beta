package sf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.tn;
public final class b implements Utilities.Callback5, b2 {
    public final int f47749a;
    public final d f47750b;

    public b(d dVar, int i10) {
        this.f47749a = i10;
        this.f47750b = dVar;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f47749a) {
            case 1:
                this.f47750b.X();
                return;
            default:
                this.f47750b.finishFragment();
                return;
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.f47750b;
        if (!dVar.d.h(w41Var)) {
            int i10 = w41Var.d;
            if (i10 != 2 && w41Var.f50845a != 17) {
                if (i10 == 1) {
                    dVar.f47770s = !dVar.f47770s;
                    dVar.f47765c.U2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 6) {
                    w wVar = dVar.d;
                    dVar.v = true;
                    wVar.h = true;
                    dVar.f47765c.U2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 7) {
                    w wVar2 = dVar.d;
                    dVar.v = false;
                    wVar2.h = false;
                    dVar.f47765c.U2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 3) {
                    dVar.f47772x = 0;
                    dVar.f47765c.U2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 4) {
                    dVar.f47772x = 1;
                    dVar.f47765c.U2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 5) {
                    dVar.f47772x = 2;
                    dVar.f47765c.U2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 8) {
                    c5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.B, new b5() {
                        @Override
                        public final void I(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.B = i11;
                                    ((m8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar2.V(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.C = i11;
                                    ((m8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    c5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.C, new b5() {
                        @Override
                        public final void I(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.B = i11;
                                    ((m8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar2.V(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.C = i11;
                                    ((m8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !dVar.f47771w;
                    dVar.f47771w = z10;
                    ((q8) view).setChecked(z10);
                    dVar.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new tn(bundle));
        }
    }
}
