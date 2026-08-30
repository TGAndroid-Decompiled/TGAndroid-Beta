package qh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import cg.u;
import dg.n;
import f2.l;
import fg.i;
import k7.b6;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import ph.d4;
import ph.f3;
public final class f extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final mf.a U;
    public final u V;
    public final FrameLayout W;
    public Runnable X;
    public w51 Y;

    public f(Context context, f6 f6Var, mf.a aVar, boolean z4, Runnable runnable) {
        super(context, null, false, false, false, 1, f6Var);
        this.v = 0.2f;
        this.X = runnable;
        fixNavigationBar();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new n(this, 18));
        l lVar = new l();
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(j6.v0(j6.f19977h5, f6Var));
        this.U = aVar;
        u uVar = new u(context, 4, f6Var);
        this.V = uVar;
        ((TextView) uVar.f2536c).setText(LocaleController.formatString(R.string.TonNeededTitle, mf.a.i(aVar.f13929b - t7.y(this.currentAccount, true).s().f13929b, mf.b.f13931b).d()));
        TextView textView = (TextView) uVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        ph.d dVar = new ph.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, b6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z4 && !g.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f43075b;

                {
                    this.f43075b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            af.g.u(this.f43075b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f43075b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f43075b;

                {
                    this.f43075b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            af.g.u(this.f43075b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f43075b.dismiss();
                            return;
                    }
                }
            });
        }
        w51 w51Var = this.Y;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w51 w51Var = this.Y;
            if (w51Var != null) {
                w51Var.N(true);
            }
            mf.a s6 = t7.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            mf.a aVar = this.U;
            ((TextView) this.V.f2536c).setText(LocaleController.formatString(i12, mf.a.i(aVar.f13929b - s6.f13929b, mf.b.f13931b).d()));
            pa paVar = this.e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (s6.f13929b >= aVar.f13929b && (runnable = this.X) != null) {
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
            ((i) uVar.f2535b).setPaused(true);
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
        if (t7.y(this.currentAccount, true).s().f13929b >= this.U.f13929b) {
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
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 6), this.resourcesProvider);
        this.Y = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        u uVar = this.V;
        if (uVar == null) {
            return null;
        }
        return ((TextView) uVar.f2536c).getText();
    }
}
