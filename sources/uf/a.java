package uf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.zn;
public final class a implements Utilities.Callback5, c2 {
    public final int f45301a;
    public final c f45302b;

    public a(c cVar, int i10) {
        this.f45301a = i10;
        this.f45302b = cVar;
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f45301a) {
            case 1:
                this.f45302b.X();
                return;
            default:
                this.f45302b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f45302b;
        if (!cVar.d.h(i51Var)) {
            int i10 = i51Var.d;
            if (i10 != 2 && i51Var.f1830a != 17) {
                if (i10 == 1) {
                    cVar.f45327s = !cVar.f45327s;
                    cVar.f45323c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    v vVar = cVar.d;
                    cVar.v = true;
                    vVar.h = true;
                    cVar.f45323c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    v vVar2 = cVar.d;
                    cVar.v = false;
                    vVar2.h = false;
                    cVar.f45323c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f45329x = 0;
                    cVar.f45323c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f45329x = 1;
                    cVar.f45323c.V2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f45329x = 2;
                    cVar.f45323c.V2.N(true);
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
                                    ((n8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.D = i11;
                                    ((n8) view).u(LocaleController.formatShortDateTime(i11), true);
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
                                    ((n8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.D = i11;
                                    ((n8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z4 = !cVar.f45328w;
                    cVar.f45328w = z4;
                    ((r8) view).setChecked(z4);
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
            cVar.presentFragment(new zn(bundle));
        }
    }
}
