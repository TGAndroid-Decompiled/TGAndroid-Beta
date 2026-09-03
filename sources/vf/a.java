package vf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.xn;
public final class a implements Utilities.Callback5, c2 {
    public final int f49010a;
    public final c f49011b;

    public a(c cVar, int i10) {
        this.f49010a = i10;
        this.f49011b = cVar;
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f49010a) {
            case 1:
                this.f49011b.X();
                return;
            default:
                this.f49011b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f49011b;
        if (!cVar.d.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 != 2 && h51Var.f2505a != 17) {
                if (i10 == 1) {
                    cVar.f49040s = !cVar.f49040s;
                    cVar.f49035c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    v vVar = cVar.d;
                    cVar.v = true;
                    vVar.h = true;
                    cVar.f49035c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    v vVar2 = cVar.d;
                    cVar.v = false;
                    vVar2.h = false;
                    cVar.f49035c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f49042x = 0;
                    cVar.f49035c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f49042x = 1;
                    cVar.f49035c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f49042x = 2;
                    cVar.f49035c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    z4.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.C, new y4() {
                        @Override
                        public final void I(int i11, int i12, boolean z4) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.C = i11;
                                    ((o8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.D = i11;
                                    ((o8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    z4.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.D, new y4() {
                        @Override
                        public final void I(int i11, int i12, boolean z4) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.C = i11;
                                    ((o8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.D = i11;
                                    ((o8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z4 = !cVar.f49041w;
                    cVar.f49041w = z4;
                    ((s8) view).setChecked(z4);
                    cVar.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new xn(bundle));
        }
    }
}
