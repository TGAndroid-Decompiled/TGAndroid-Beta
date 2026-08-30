package uf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.xn;
public final class a implements Utilities.Callback5, c2 {
    public final int f45237a;
    public final c f45238b;

    public a(c cVar, int i10) {
        this.f45237a = i10;
        this.f45238b = cVar;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f45237a) {
            case 1:
                this.f45238b.X();
                return;
            default:
                this.f45238b.finishFragment();
                return;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f45238b;
        if (!cVar.d.h(i51Var)) {
            int i10 = i51Var.d;
            if (i10 != 2 && i51Var.f1808a != 17) {
                if (i10 == 1) {
                    cVar.f45263s = !cVar.f45263s;
                    cVar.f45259c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    v vVar = cVar.d;
                    cVar.v = true;
                    vVar.h = true;
                    cVar.f45259c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    v vVar2 = cVar.d;
                    cVar.v = false;
                    vVar2.h = false;
                    cVar.f45259c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f45265x = 0;
                    cVar.f45259c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f45265x = 1;
                    cVar.f45259c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f45265x = 2;
                    cVar.f45259c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    z4.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.C, new y4() {
                        @Override
                        public final void J(int i11, int i12, boolean z4) {
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
                        public final void J(int i11, int i12, boolean z4) {
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
                    boolean z4 = !cVar.f45264w;
                    cVar.f45264w = z4;
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
