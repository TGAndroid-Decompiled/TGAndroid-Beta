package rh;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.sl0;
public final class h extends FrameLayout {
    public final int f47000a;
    public final ArrayList f47001b;
    public final v51 f47002c;
    public String d;
    public boolean e;
    public boolean f47003f;
    public boolean h;
    public final ph.x1 f47004n;
    public final i f47005r;

    public h(i iVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        ei.r rVar;
        this.f47005r = iVar;
        this.f47001b = new ArrayList();
        this.d = "";
        this.f47004n = new ph.x1(this, 8);
        this.f47000a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
        int classGuid = iVar.getClassGuid();
        qh.d dVar = new qh.d(this, 2);
        mg.l lVar = new mg.l(this, 29);
        p6Var = ((org.telegram.ui.ActionBar.k2) iVar).resourceProvider;
        v51 v51Var = new v51(context, i11, classGuid, true, dVar, lVar, null, p6Var);
        this.f47002c = v51Var;
        v51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        v51Var.f31183f3.f29638r = false;
        v51Var.setCaptureSectionsDecoratorAllowed(true);
        v51Var.setClipToPadding(false);
        v51Var.setOverScrollMode(0);
        addView(v51Var, w7.b6.c(-1.0f, -1));
        rVar = ((org.telegram.ui.ActionBar.k2) iVar).glassEngine;
        rVar.b(v51Var);
        v51Var.j(new cu0(this, 16));
    }

    public final void a() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        i iVar = this.f47005r;
        if (!iVar.O && !this.e && !this.f47003f && !this.h) {
            boolean z11 = true;
            this.e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i13 = this.f47000a;
            if (i13 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i13 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            i10 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
            tL_payments_getStarsTransactions.peer = wp.r1(i10).i1(iVar.f47049b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f47002c.f31183f3.O(false);
            i11 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new sl0(24, this, str));
            i12 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
            ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, iVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f47004n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f47004n);
        super.onDetachedFromWindow();
    }
}
