package qh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import i7.f6;
import java.util.WeakHashMap;
import jh.oa;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
import org.telegram.ui.tn;
public final class q extends o2 implements vd.b {
    public final vd.a f46766a;
    public long f46767b;
    public FrameLayout f46768c;
    public u51 d;
    public ug.f f46769e;
    public LinearLayout f46770f;
    public nh.d h;
    public nh.d f46771n;
    public qw0 f46772r;
    public TLRPC.ChatFull f46773s;
    public o0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.f46766a = new vd.a(0, this, jr.h, 320L, false);
    }

    public static void U(q qVar, w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof rh.e) {
            rh.e eVar = (rh.e) obj;
            long j10 = eVar.f47439a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(tn.R9(user.f22539id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new sh.b(qVar.getParentActivity(), chat, new org.telegram.ui.web.y(16, qVar, eVar)).show();
            } else {
                qVar.presentFragment(tn.R9(-chat.f22392id));
            }
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        float f11 = 1.0f - f9;
        this.f46770f.setAlpha(f11);
        LinearLayout linearLayout = this.f46770f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f46772r.setAlpha(f9);
        qw0 qw0Var = this.f46772r;
        if (f9 > 0.0f) {
            i12 = 0;
        }
        qw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f46770f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f46772r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f46769e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        o0 o0Var = new o0(getParentActivity(), this.resourceProvider, tc.a0(this), this.currentAccount, this.f46767b);
        this.v = o0Var;
        o0Var.h = new o1.a(this, 17);
        o0Var.d();
        this.v.e();
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46768c = frameLayout;
        int i10 = g6.f23009a7;
        frameLayout.setBackgroundColor(g6.w0(null, i10, false));
        u51 u51Var = new u51(this, new t4(this, 14), new o(this), new o(this));
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.d;
        u51Var2.U2.f29939r = false;
        u51Var2.p1();
        this.d.j(new h00(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f46768c.addView(this.d, f6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f46769e = view;
        view.setupColorKey(i10);
        this.f46769e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f46769e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f46768c.addView(this.f46769e, f6.g());
        this.f46768c.addView(this.actionBar, f6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46770f = linearLayout;
        linearLayout.setOrientation(0);
        this.f46770f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        nh.d dVar = new nh.d(context, this.resourceProvider, true);
        this.f46771n = dVar;
        dVar.d();
        this.f46771n.setColor(i0.a.d(0.125f, getThemedColor(g6.f23062d6), getThemedColor(g6.G6)));
        this.f46771n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f46771n.e();
        this.f46771n.setOnClickListener(new View.OnClickListener(this) {
            public final q f46765b;

            {
                this.f46765b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f46765b.v.f(false, true);
                        return;
                    default:
                        this.f46765b.v.f(true, true);
                        return;
                }
            }
        });
        this.f46770f.addView(this.f46771n, f6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        nh.d dVar2 = new nh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f46765b;

            {
                this.f46765b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f46765b.v.f(false, true);
                        return;
                    default:
                        this.f46765b.v.f(true, true);
                        return;
                }
            }
        });
        this.f46770f.addView(this.h, f6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f46768c.addView(this.f46770f, f6.e(-1, -2, 80));
        qw0 qw0Var = new qw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f46772r = qw0Var;
        qw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f46772r.f32122e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f46772r.setAnimateLayoutChange(true);
        this.f46772r.setVisibility(8);
        this.f46768c.addView(this.f46772r, f6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f46773s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f46766a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f46768c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new eg.x(16));
        FrameLayout frameLayout3 = this.f46768c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f46767b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f46767b));
        this.f46773s = getMessagesController().getChatFull(this.f46767b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o0 o0Var = this.v;
        oa oaVar = o0Var.f46754i;
        if (oaVar != null) {
            oaVar.run();
        }
        o0Var.f46754i = null;
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
