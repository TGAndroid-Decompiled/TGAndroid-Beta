package xh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.cl0;
import org.telegram.ui.o10;
import org.telegram.ui.zh;
import w7.b6;
public final class i extends o10 implements vs {
    public final long R;
    public FrameLayout S;
    public lg.q T;
    public LinearLayout U;
    public ph.i V;
    public p80 W;
    public boolean Y;
    public TL_payments.starRefProgram Z;
    public TL_payments.starRefProgram f53805a0;
    public boolean f53808d0;
    public ph.o3 f53809e0;
    public final d X = new d(this, 0);
    public String[] f53806b0 = null;
    public final List f53807c0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public i(long j10) {
        this.R = j10;
        this.M = true;
        this.L = org.telegram.messenger.i0.L(60.0f);
    }

    public static void A0(i iVar, Context context) {
        String G;
        int i10;
        int i11;
        if (!iVar.V.f51070c0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        xy0 xy0Var = new xy0(context, iVar.resourceProvider);
        d dVar = new d(iVar, 1);
        xy0Var.c(dd.L0(2131754344, null), J0(iVar.f53805a0.commission_permille), null, null);
        String L0 = dd.L0(2131754342, null);
        int i12 = iVar.f53805a0.duration_months;
        if (i12 <= 0) {
            G = dd.L0(2131749207, null);
        } else if (i12 >= 12 && i12 % 12 == 0) {
            G = dd.G(i12 / 12, "Years", new Object[0]);
        } else {
            G = dd.G(i12, "Months", new Object[0]);
        }
        xy0Var.c(L0, G, null, null);
        frameLayout.addView(xy0Var, b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, iVar.resourceProvider);
        String L02 = dd.L0(2131754347, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L02;
        if (iVar.Y) {
            i10 = 2131754330;
        } else {
            i10 = 2131754316;
        }
        x1Var.T = dd.L0(i10, null);
        alertDialog$Builder.o(frameLayout);
        if (iVar.Y) {
            i11 = 2131754331;
        } else {
            i11 = 2131754317;
        }
        alertDialog$Builder.k(dd.L0(i11, null), new wh.b(dVar, 8));
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    public static void B0(i iVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = iVar.R;
        x1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull a2 = iVar.getMessagesController().a2(j10);
            if (a2 != null) {
                a2.starref_program = starrefprogram;
                iVar.getMessagesStorage().j2(a2, false);
                at.f(iVar.currentAccount).k(at.E0, Long.valueOf(j10), a2);
            }
            iVar.G0(false);
        } else if (tL_error != null) {
            cc.d0(tL_error);
        }
    }

    public static void C0(i iVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        long j10 = iVar.R;
        x1Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull a2 = iVar.getMessagesController().a2(j10);
            if (a2 != null) {
                TL_payments.starRefProgram starrefprogram2 = iVar.f53805a0;
                starrefprogram2.flags |= 2;
                int currentTime = iVar.getConnectionsManager().getCurrentTime();
                if (iVar.getConnectionsManager().isTestBackend()) {
                    i10 = 300;
                } else {
                    i10 = 86400;
                }
                starrefprogram2.end_date = currentTime + i10;
                a2.starref_program = starrefprogram;
                iVar.getMessagesStorage().j2(a2, false);
                at.f(iVar.currentAccount).k(at.E0, Long.valueOf(j10), a2);
            }
            iVar.G0(true);
        } else if (tL_error != null) {
            cc.d0(tL_error);
        }
    }

    public static void D0(i iVar, int i10) {
        ph.o3 o3Var = iVar.f53809e0;
        if (o3Var != null) {
            int i11 = o3Var.G(i10).d;
            if (i11 == 4) {
                LinearLayout linearLayout = new LinearLayout(iVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
                TextView textView = new TextView(iVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i12 = t6.G6;
                a7.V(textView, i12, iVar.resourceProvider);
                textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131754322, null)));
                linearLayout.addView(textView, b6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                cl0 cl0Var = new cl0(iVar.getParentActivity(), 4);
                cl0Var.setPadding(org.telegram.messenger.i0.L(15.0f), 0, 0, 0);
                cl0Var.setTextSize(1, 16.0f);
                a7.V(cl0Var, i12, iVar.resourceProvider);
                cl0Var.setText(org.telegram.messenger.i0.W2(dd.L0(2131754321, null)));
                linearLayout.addView(cl0Var, b6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                cl0 cl0Var2 = new cl0(iVar.getParentActivity(), 4);
                cl0Var2.setPadding(org.telegram.messenger.i0.L(15.0f), 0, 0, 0);
                cl0Var2.setTextSize(1, 16.0f);
                a7.V(cl0Var2, i12, iVar.resourceProvider);
                cl0Var2.setText(org.telegram.messenger.i0.W2(dd.L0(2131754320, null)));
                linearLayout.addView(cl0Var2, b6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                cl0 cl0Var3 = new cl0(iVar.getParentActivity(), 4);
                cl0Var3.setPadding(org.telegram.messenger.i0.L(15.0f), 0, 0, 0);
                cl0Var3.setTextSize(1, 16.0f);
                a7.V(cl0Var3, i12, iVar.resourceProvider);
                cl0Var3.setText(org.telegram.messenger.i0.W2(dd.L0(2131754319, null)));
                linearLayout.addView(cl0Var3, b6.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, iVar.getParentActivity(), iVar.resourceProvider);
                alertDialog$Builder.f20135a.R = dd.L0(2131754347, null);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(dd.L0(2131754323, null), new wh.b(iVar, 9));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i11 == 2) {
                iVar.presentFragment(new s3(iVar.R));
            }
        }
    }

    public static String J0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) == f7) {
            Locale locale = Locale.US;
            return a1.g.k(i10 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
    }

    public final void G0(boolean z10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            z4 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(size);
                    if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).a() == this.R) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    k2Var = null;
                    break;
                }
            }
            if (k2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.k2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                k2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
            k2Var = null;
        }
        if (k2Var != null) {
            if (z10) {
                cc.a0(k2Var).I(2131624078, dd.L0(2131754339, null), org.telegram.messenger.i0.W2(dd.L0(2131754340, null))).j();
            } else {
                cc.a0(k2Var).I(2131623989, dd.L0(2131754325, null), dd.L0(2131754326, null)).j();
            }
        }
    }

    public final void H0(ArrayList arrayList, q51 q51Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        b51 b51Var = new b51(-2);
        b51Var.f24637c = (bi.t0) super.o0(getParentActivity());
        arrayList.add(b51Var);
        arrayList.add(g.i(2131231809, dd.L0(2131753151, null), dd.L0(2131753152, null)));
        arrayList.add(g.i(2131232087, dd.L0(2131753149, null), dd.L0(2131753150, null)));
        arrayList.add(g.i(2131231805, dd.L0(2131753147, null), dd.L0(2131753148, null)));
        arrayList.add(b51.B(1, null));
        arrayList.add(b51.u(dd.L0(2131754344, null)));
        int i11 = getMessagesController().f19155i6;
        int i12 = this.f53805a0.commission_permille;
        int i13 = getMessagesController().f19164j6;
        zh zhVar = new zh(13);
        a aVar = new a(this, 1);
        b51 b51Var2 = new b51(15);
        b51Var2.f24656z = i12;
        b51Var2.C = aVar;
        w7 w7Var = new w7();
        w7Var.f23407a = i11;
        w7Var.f23408b = i13;
        w7Var.e = new ca(zhVar, 7);
        b51Var2.G = w7Var;
        b51Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.Z;
        if (starrefprogram == null) {
            i10 = -1;
        } else {
            i10 = starrefprogram.commission_permille;
        }
        b51Var2.B = i10;
        arrayList.add(b51Var2);
        arrayList.add(b51.C(dd.L0(2131754343, null)));
        arrayList.add(b51.u(dd.L0(2131754342, null)));
        String[] strArr = this.f53806b0;
        List list = this.f53807c0;
        if (strArr == null) {
            this.f53806b0 = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                if (intValue == 0) {
                    this.f53806b0[i14] = dd.L0(2131749207, null);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f53806b0[i14] = dd.G(intValue / 12, "YearsShort", new Object[0]);
                } else {
                    this.f53806b0[i14] = dd.G(intValue, "MonthsShort", new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f53806b0;
        int indexOf = list.indexOf(Integer.valueOf(this.f53805a0.duration_months));
        a aVar2 = new a(this, 2);
        b51 b51Var3 = new b51(14);
        b51Var3.f24647p = strArr2;
        b51Var3.f24656z = indexOf;
        b51Var3.C = aVar2;
        b51Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.Z;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                b51Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.Z.duration_months) {
                        b51Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(b51Var3);
        arrayList.add(b51.C(dd.L0(2131754341, null)));
        arrayList.add(e.i(2, getThemedColor(t6.ik), dd.L0(2131754337, null), dd.L0(2131754338, null)));
        arrayList.add(b51.B(3, null));
        if (!this.Y && this.f53805a0.end_date == 0) {
            b51 e = b51.e(4, dd.L0(2131754324, null));
            e.f24649r = true;
            arrayList.add(e);
            arrayList.add(b51.B(5, null));
        }
        arrayList.add(b51.B(6, null));
        arrayList.add(b51.B(7, null));
    }

    public final TL_payments.starRefProgram I0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.j(50, getMessagesController().f19164j6, getMessagesController().f19155i6);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void K0(boolean z10) {
        int i10;
        int i11;
        ph.i iVar = this.V;
        if (!this.Y && this.f53805a0.end_date == 0) {
            i10 = 2131754318;
        } else {
            i10 = 2131754332;
        }
        iVar.i(dd.L0(i10, null), z10, true);
        d dVar = this.X;
        org.telegram.messenger.i0.r(dVar);
        dVar.run();
        p80 p80Var = this.W;
        if (!this.Y && this.f53805a0.end_date == 0) {
            i11 = 2131754315;
        } else {
            i11 = 2131754328;
        }
        p80Var.setText(org.telegram.messenger.i0.T2(dd.L0(i11, null), new d(this, 2)));
        L0();
        ph.o3 o3Var = this.f53809e0;
        if (o3Var != null) {
            o3Var.O(z10);
        }
    }

    public final void L0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        ph.i iVar = this.V;
        TL_payments.starRefProgram starrefprogram2 = this.f53805a0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.Z) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        a7.i(t6.f21020i5, new bo0(this, context, 13), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        lg.q qVar = new lg.q(context, 1, 3);
        this.T = qVar;
        lg.h hVar = qVar.f11920b;
        hVar.f11898z = t6.Tk;
        hVar.A = t6.Uk;
        hVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, b6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        j0(dd.L0(2131753143, null), dd.L0(2131753144, null), this.S, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        a7.i(t6.f20930d6, this.U, getResourceProvider());
        View view = new View(context);
        a7.i(t6.f20931d7, view, getResourceProvider());
        this.U.addView(view, new LinearLayout.LayoutParams(b6.z(-1.0f), b6.z(1.0f / org.telegram.messenger.i0.f16171p)));
        ph.i iVar = new ph.i(3, context, this.resourceProvider, true);
        iVar.setRoundRadius(24);
        this.V = iVar;
        iVar.i(dd.L0(2131754332, null), false, true);
        this.V.setOnClickListener(new rh.u1(11, this, context));
        this.U.addView(this.V, b6.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        p80 p80Var = new p80(context, this.resourceProvider);
        this.W = p80Var;
        a7.V(p80Var, t6.f21331z6, getResourceProvider());
        a7.H(this.W, t6.Uc, getResourceProvider());
        this.W.setTextSize(1, 12.0f);
        this.W.setGravity(17);
        this.U.addView(this.W, b6.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        K0(false);
        ((FrameLayout) this.fragmentView).addView(this.U, b6.e(-1, -2, 87));
        this.f40007c.setPadding(0, 0, 0, org.telegram.messenger.i0.L(84.0f));
        this.f40007c.setOnItemClickListener(new ag.y0(this, 24));
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f40007c.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(t6.f20930d6);
    }

    @Override
    public final s4.g0 k0() {
        ph.o3 o3Var = new ph.o3(this, this.f40007c, getParentActivity(), this.currentAccount, this.classGuid, new qh.d(this, 26), getResourceProvider(), 4);
        this.f53809e0 = o3Var;
        return o3Var;
    }

    @Override
    public final kg.g2 m0() {
        kg.g gVar = new kg.g(getParentActivity(), 4);
        gVar.c();
        return gVar;
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53808d0 = true;
        this.Y = true;
        this.f53805a0 = I0();
        this.Z = null;
        wp messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.UserFull a2 = messagesController.a2(j10);
        if (a2 != null) {
            this.Y = false;
            TL_payments.starRefProgram starrefprogram = a2.starref_program;
            this.f53805a0 = starrefprogram;
            if (starrefprogram == null) {
                this.Y = true;
                this.f53805a0 = I0();
                this.Z = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.Z = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f53805a0;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 != null) {
                getMessagesController().U2(Z1, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.f53808d0 = false;
        org.telegram.messenger.i0.r(this.X);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f40007c.setPadding(0, 0, 0, org.telegram.messenger.i0.L(84.0f) + i13);
        this.f40007c.setClipToPadding(false);
        this.U.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        lg.q qVar = this.T;
        if (qVar != null) {
            qVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        lg.q qVar = this.T;
        if (qVar != null) {
            qVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
