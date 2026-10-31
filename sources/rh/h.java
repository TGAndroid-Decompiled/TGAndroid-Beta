package rh;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.ul0;
public final class h extends FrameLayout {
    public final int f46986a;
    public final ArrayList f46987b;
    public final u51 f46988c;
    public String d;
    public boolean e;
    public boolean f46989f;
    public boolean h;
    public final ph.x1 f46990n;
    public final i f46991r;

    public h(i iVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        ei.r rVar;
        this.f46991r = iVar;
        this.f46987b = new ArrayList();
        this.d = "";
        this.f46990n = new ph.x1(this, 8);
        this.f46986a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
        int classGuid = iVar.getClassGuid();
        qh.d dVar = new qh.d(this, 2);
        mg.l lVar = new mg.l(this, 29);
        p6Var = ((org.telegram.ui.ActionBar.k2) iVar).resourceProvider;
        u51 u51Var = new u51(context, i11, classGuid, true, dVar, lVar, null, p6Var);
        this.f46988c = u51Var;
        u51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        u51Var.f30819f3.f29295r = false;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u51Var.setClipToPadding(false);
        u51Var.setOverScrollMode(0);
        addView(u51Var, w7.b6.c(-1.0f, -1));
        rVar = ((org.telegram.ui.ActionBar.k2) iVar).glassEngine;
        rVar.b(u51Var);
        u51Var.j(new bu0(this, 16));
    }

    public final void a() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        i iVar = this.f46991r;
        if (!iVar.O && !this.e && !this.f46989f && !this.h) {
            boolean z11 = true;
            this.e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i13 = this.f46986a;
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
            tL_payments_getStarsTransactions.peer = vp.r1(i10).i1(iVar.f47035b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f46988c.f30819f3.O(false);
            i11 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new ul0(24, this, str));
            i12 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
            ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, iVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f46990n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f46990n);
        super.onDetachedFromWindow();
    }
}
