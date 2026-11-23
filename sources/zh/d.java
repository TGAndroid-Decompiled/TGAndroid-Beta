package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import fi.u;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.c9;
import org.telegram.ui.ee;
public final class d {
    public final g2 f62105a;
    public final TLRPC.Chat f62106b;
    public final int f62107c;
    public FrameLayout d;
    public u f62108e;
    public LinearLayout f62109f;
    public TextView f62110g;
    public ImageView h;
    public b f62111i;
    public TLRPC.ChatFull f62112j;
    public int f62113k;
    public int f62114l = -1;
    public c f62115m;

    public d(TLRPC.Chat chat, g2 g2Var) {
        this.f62105a = g2Var;
        this.f62106b = chat;
        this.f62107c = g2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        if (this.d.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                int i7 = this.f62114l;
                g2 g2Var = this.f62105a;
                TLRPC.Chat chat = this.f62106b;
                if (i7 == -1 && chat != null) {
                    mp messagesController = g2Var.getMessagesController();
                    long j3 = chat.f28492id;
                    this.f62114l = messagesController.h7.getInt("chatPendingRequests" + j3, 0);
                }
                int i10 = this.f62113k;
                int i11 = this.f62114l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        g2Var.getMessagesController().P4(0, chat.f28492id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f62115m;
            if (cVar != null) {
                cVar.e(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            g2 g2Var = this.f62105a;
            FrameLayout frameLayout = new FrameLayout(g2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(n6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f62104b;

                {
                    this.f62104b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f62104b;
                            g2 g2Var2 = dVar.f62105a;
                            if (dVar.f62111i == null) {
                                dVar.f62111i = new b(dVar, g2Var2, dVar.f62106b.f28492id);
                            }
                            g2Var2.showDialog(dVar.f62111i);
                            return;
                        default:
                            d dVar2 = this.f62104b;
                            dVar2.f62105a.getMessagesController().P4(dVar2.f62113k, dVar2.f62106b.f28492id);
                            dVar2.f62114l = dVar2.f62113k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(g2Var.getParentActivity());
            this.f62109f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f62109f, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            u uVar = new u(1, g2Var.getParentActivity(), false);
            this.f62108e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            c9 c9Var = this.f62108e.f34245a;
            for (int i7 = 0; i7 < c9Var.f33951c.length; i7++) {
                c9Var.j(0, 0, null);
            }
            this.f62109f.addView(this.f62108e, na.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(g2Var.getParentActivity());
            this.f62110g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f62110g.setGravity(16);
            this.f62110g.setSingleLine();
            this.f62110g.setText((CharSequence) null);
            u6.U(this.f62110g, n6.We, g2Var.getResourceProvider());
            this.f62110g.setTypeface(g0.o());
            this.f62109f.addView(this.f62110g, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(g2Var.getParentActivity());
            int i10 = n6.f29825x7;
            int themedColor = g2Var.getThemedColor(i10);
            y h02 = n6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                u6.Q(this.h, h02, null, u6.g(i10, 25), g2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            u6.s(this.h, n6.Ue, g2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(gd.N0(2131752029, null));
            this.h.setImageResource(2131231987);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f62104b;

                {
                    this.f62104b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f62104b;
                            g2 g2Var2 = dVar.f62105a;
                            if (dVar.f62111i == null) {
                                dVar.f62111i = new b(dVar, g2Var2, dVar.f62106b.f28492id);
                            }
                            g2Var2.showDialog(dVar.f62111i);
                            return;
                        default:
                            d dVar2 = this.f62104b;
                            dVar2.f62105a.getMessagesController().P4(dVar2.f62113k, dVar2.f62106b.f28492id);
                            dVar2.f62114l = dVar2.f62113k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, na.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f62112j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(ee eeVar) {
        this.f62115m = eeVar;
    }

    public final void d(int i7, List list, boolean z10) {
        if (this.d != null) {
            g2 g2Var = this.f62105a;
            if (i7 <= 0) {
                TLRPC.Chat chat = this.f62106b;
                if (chat != null) {
                    g2Var.getMessagesController().P4(0, chat.f28492id);
                    this.f62114l = 0;
                }
                a(false, z10);
                this.f62113k = 0;
            } else if (this.f62113k != i7) {
                this.f62113k = i7;
                this.f62110g.setText(gd.G(i7, "JoinUsersRequests", new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User c22 = g2Var.getMessagesController().c2((Long) list.get(i10));
                        if (c22 != null) {
                            this.f62108e.b(i10, this.f62107c, c22);
                        }
                    }
                    this.f62108e.setCount(min);
                    this.f62108e.a(true);
                }
            }
        }
    }
}
