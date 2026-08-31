package rh;

import ag.h;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.u;
import f2.l;
import gg.i;
import k7.c6;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import qh.d4;
import qh.f3;
public final class f extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final mf.a U;
    public final u V;
    public final FrameLayout W;
    public Runnable X;
    public x51 Y;

    public f(Context context, g6 g6Var, mf.a aVar, boolean z4, Runnable runnable) {
        super(context, null, false, false, false, 1, g6Var);
        this.v = 0.2f;
        this.X = runnable;
        fixNavigationBar();
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new h(this, 19));
        l lVar = new l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(k6.v0(k6.f21731h5, g6Var));
        this.U = aVar;
        u uVar = new u(context, 4, g6Var);
        this.V = uVar;
        ((TextView) uVar.f4680c).setText(LocaleController.formatString(R.string.TonNeededTitle, mf.a.i(aVar.f13650b - t7.y(this.currentAccount, true).s().f13650b, mf.b.f13652b).d()));
        TextView textView = (TextView) uVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f3.a(textView.getText(), textView.getPaint()));
        this.f31015e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        qh.d dVar = new qh.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, c6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z4 && !g.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f46824b;

                {
                    this.f46824b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            af.g.u(this.f46824b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f46824b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f46824b;

                {
                    this.f46824b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            af.g.u(this.f46824b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f46824b.dismiss();
                            return;
                    }
                }
            });
        }
        x51 x51Var = this.Y;
        if (x51Var != null) {
            x51Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            x51 x51Var = this.Y;
            if (x51Var != null) {
                x51Var.N(true);
            }
            mf.a s6 = t7.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            mf.a aVar = this.U;
            ((TextView) this.V.f4680c).setText(LocaleController.formatString(i12, mf.a.i(aVar.f13650b - s6.f13650b, mf.b.f13652b).d()));
            pa paVar = this.f31015e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (s6.f13650b >= aVar.f13650b && (runnable = this.X) != null) {
                runnable.run();
                this.X = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        u uVar = this.V;
        if (uVar != null) {
            ((i) uVar.f4679b).setPaused(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        jk jkVar;
        if (t7.y(this.currentAccount, true).s().f13650b >= this.U.f13650b) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
                return;
            }
            return;
        }
        p2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.V) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 6), this.resourcesProvider);
        this.Y = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        u uVar = this.V;
        if (uVar == null) {
            return null;
        }
        return ((TextView) uVar.f4680c).getText();
    }
}
