package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

public final class y81 extends AnimatorListenerAdapter {

    public final int f44738a;

    public final a91 f44739b;

    public y81(a91 a91Var, int i10) {
        this.f44738a = i10;
        this.f44739b = a91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44738a) {
            case 0:
                a91 a91Var = this.f44739b;
                a91Var.f36464b.setVisibility(4);
                rf.g gVar = a91Var.f36464b;
                gVar.F = false;
                rf.g gVar2 = a91Var.f36465c;
                gVar2.F = true;
                gVar.f46985u0 = 0;
                gVar2.f46985u0 = 0;
                Window window = a91Var.f36463a;
                if (window != null) {
                    window.clearFlags(16);
                }
                break;
            case 1:
                a91 a91Var2 = this.f44739b;
                rf.g gVar3 = a91Var2.f36465c;
                gVar3.setVisibility(4);
                rf.g gVar4 = a91Var2.f36464b;
                gVar4.f46985u0 = 0;
                gVar3.f46985u0 = 0;
                gVar4.F = true;
                gVar3.F = false;
                if (gVar4 instanceof rf.q) {
                    gVar4.f46979q0 = false;
                    gVar4.d();
                } else {
                    gVar4.f46979q0 = true;
                    gVar4.x((gVar4.C0 * gVar4.f46959c0.f47008k) - rf.g.f46934g1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = a91Var2.f36463a;
                if (window2 != null) {
                    window2.clearFlags(16);
                }
                break;
            default:
                a91 a91Var3 = this.f44739b;
                a91Var3.f36464b.f46985u0 = 0;
                a91Var3.f36466e.setVisibility(8);
                break;
        }
    }
}
