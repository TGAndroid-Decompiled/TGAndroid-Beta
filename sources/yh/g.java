package yh;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.si1;
public final class g extends FrameLayout {
    public final int f51310a;
    public final ArrayList f51311b;
    public final e71 f51312c;
    public String d;
    public boolean f51313e;
    public boolean f51314f;
    public boolean h;
    public final rg.s1 f51315n;
    public final h f51316r;

    public g(h hVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        li.p pVar;
        this.f51316r = hVar;
        this.f51311b = new ArrayList();
        this.d = "";
        this.f51315n = new rg.s1(this, 22);
        this.f51310a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
        int classGuid = hVar.getClassGuid();
        hi.a aVar = new hi.a(this, 22);
        r2.s sVar = new r2.s(this, 21);
        d6Var = ((org.telegram.ui.ActionBar.n2) hVar).resourceProvider;
        e71 e71Var = new e71(context, i11, classGuid, true, aVar, sVar, null, d6Var);
        this.f51312c = e71Var;
        e71Var.s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        e71Var.f26034f3.f32531r = false;
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        e71Var.setClipToPadding(false);
        e71Var.setOverScrollMode(0);
        addView(e71Var, w7.z5.c(-1.0f, -1));
        pVar = ((org.telegram.ui.ActionBar.n2) hVar).glassEngine;
        pVar.b(e71Var);
        e71Var.j(new xb0(this, 19));
    }

    public final void a() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        h hVar = this.f51316r;
        if (!hVar.O && !this.f51313e && !this.f51314f && !this.h) {
            boolean z11 = true;
            this.f51313e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i13 = this.f51310a;
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
            i10 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i10).getInputPeer(hVar.f51368b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f51312c.f26034f3.N(false);
            i11 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new si1(7, this, str));
            i12 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
            ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, hVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f51315n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f51315n);
        super.onDetachedFromWindow();
    }
}
