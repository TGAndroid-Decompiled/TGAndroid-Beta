package pf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.qn;
public final class b implements Utilities.Callback5, b2 {
    public final int f45566a;
    public final d f45567b;

    public b(d dVar, int i9) {
        this.f45566a = i9;
        this.f45567b = dVar;
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f45566a) {
            case 1:
                this.f45567b.W();
                return;
            default:
                this.f45567b.finishFragment();
                return;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.f45567b;
        if (!dVar.d.h(l41Var)) {
            int i9 = l41Var.d;
            if (i9 != 2 && l41Var.f48814a != 17) {
                if (i9 == 1) {
                    dVar.f45599s = !dVar.f45599s;
                    dVar.f45594c.U2.N(true);
                    dVar.U(true);
                    return;
                } else if (i9 == 6) {
                    x xVar = dVar.d;
                    dVar.v = true;
                    xVar.h = true;
                    dVar.f45594c.U2.N(true);
                    dVar.U(true);
                    return;
                } else if (i9 == 7) {
                    x xVar2 = dVar.d;
                    dVar.v = false;
                    xVar2.h = false;
                    dVar.f45594c.U2.N(true);
                    dVar.U(true);
                    return;
                } else if (i9 == 3) {
                    dVar.f45601x = 0;
                    dVar.f45594c.U2.N(true);
                    dVar.U(true);
                    return;
                } else if (i9 == 4) {
                    dVar.f45601x = 1;
                    dVar.f45594c.U2.N(true);
                    dVar.U(true);
                    return;
                } else if (i9 == 5) {
                    dVar.f45601x = 2;
                    dVar.f45594c.U2.N(true);
                    dVar.U(true);
                    return;
                } else if (i9 == 8) {
                    y4.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.B, new x4() {
                        @Override
                        public final void B(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.B = i10;
                                    ((p8) view).u(LocaleController.formatShortDateTime(i10), true);
                                    dVar2.U(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.C = i10;
                                    ((p8) view).u(LocaleController.formatShortDateTime(i10), true);
                                    dVar3.U(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i9 == 9) {
                    y4.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.C, new x4() {
                        @Override
                        public final void B(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.B = i10;
                                    ((p8) view).u(LocaleController.formatShortDateTime(i10), true);
                                    dVar2.U(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.C = i10;
                                    ((p8) view).u(LocaleController.formatShortDateTime(i10), true);
                                    dVar3.U(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i9 == 10) {
                    boolean z10 = !dVar.f45600w;
                    dVar.f45600w = z10;
                    ((t8) view).setChecked(z10);
                    dVar.U(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new qn(bundle));
        }
    }
}
