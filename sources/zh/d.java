package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import fi.u;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.d9;
import org.telegram.ui.ee;
public final class d {
    public final g2 f62018a;
    public final TLRPC.Chat f62019b;
    public final int f62020c;
    public FrameLayout d;
    public u f62021e;
    public LinearLayout f62022f;
    public TextView f62023g;
    public ImageView h;
    public b f62024i;
    public TLRPC.ChatFull f62025j;
    public int f62026k;
    public int f62027l = -1;
    public c f62028m;

    public d(TLRPC.Chat chat, g2 g2Var) {
        this.f62018a = g2Var;
        this.f62019b = chat;
        this.f62020c = g2Var.getCurrentAccount();
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
                int i7 = this.f62027l;
                g2 g2Var = this.f62018a;
                TLRPC.Chat chat = this.f62019b;
                if (i7 == -1 && chat != null) {
                    mp messagesController = g2Var.getMessagesController();
                    long j3 = chat.f28431id;
                    this.f62027l = messagesController.h7.getInt("chatPendingRequests" + j3, 0);
                }
                int i10 = this.f62026k;
                int i11 = this.f62027l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        g2Var.getMessagesController().P4(0, chat.f28431id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f62028m;
            if (cVar != null) {
                cVar.g(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            g2 g2Var = this.f62018a;
            FrameLayout frameLayout = new FrameLayout(g2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(m6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f62017b;

                {
                    this.f62017b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f62017b;
                            g2 g2Var2 = dVar.f62018a;
                            if (dVar.f62024i == null) {
                                dVar.f62024i = new b(dVar, g2Var2, dVar.f62019b.f28431id);
                            }
                            g2Var2.showDialog(dVar.f62024i);
                            return;
                        default:
                            d dVar2 = this.f62017b;
                            dVar2.f62018a.getMessagesController().P4(dVar2.f62026k, dVar2.f62019b.f28431id);
                            dVar2.f62027l = dVar2.f62026k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(g2Var.getParentActivity());
            this.f62022f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f62022f, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            u uVar = new u(1, g2Var.getParentActivity(), false);
            this.f62021e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            d9 d9Var = this.f62021e.f34702a;
            for (int i7 = 0; i7 < d9Var.f34431c.length; i7++) {
                d9Var.j(0, 0, null);
            }
            this.f62022f.addView(this.f62021e, ma.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(g2Var.getParentActivity());
            this.f62023g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f62023g.setGravity(16);
            this.f62023g.setSingleLine();
            this.f62023g.setText((CharSequence) null);
            t6.U(this.f62023g, m6.We, g2Var.getResourceProvider());
            this.f62023g.setTypeface(g0.o());
            this.f62022f.addView(this.f62023g, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(g2Var.getParentActivity());
            int i10 = m6.f29752x7;
            int themedColor = g2Var.getThemedColor(i10);
            y h02 = m6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                t6.Q(this.h, h02, null, t6.g(i10, 25), g2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            t6.s(this.h, m6.Ue, g2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(gd.N0(2131752029, null));
            this.h.setImageResource(2131231984);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f62017b;

                {
                    this.f62017b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f62017b;
                            g2 g2Var2 = dVar.f62018a;
                            if (dVar.f62024i == null) {
                                dVar.f62024i = new b(dVar, g2Var2, dVar.f62019b.f28431id);
                            }
                            g2Var2.showDialog(dVar.f62024i);
                            return;
                        default:
                            d dVar2 = this.f62017b;
                            dVar2.f62018a.getMessagesController().P4(dVar2.f62026k, dVar2.f62019b.f28431id);
                            dVar2.f62027l = dVar2.f62026k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, ma.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f62025j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(ee eeVar) {
        this.f62028m = eeVar;
    }

    public final void d(int i7, List list, boolean z10) {
        if (this.d != null) {
            g2 g2Var = this.f62018a;
            if (i7 <= 0) {
                TLRPC.Chat chat = this.f62019b;
                if (chat != null) {
                    g2Var.getMessagesController().P4(0, chat.f28431id);
                    this.f62027l = 0;
                }
                a(false, z10);
                this.f62026k = 0;
            } else if (this.f62026k != i7) {
                this.f62026k = i7;
                this.f62023g.setText(gd.G(i7, "JoinUsersRequests", new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User c22 = g2Var.getMessagesController().c2((Long) list.get(i10));
                        if (c22 != null) {
                            this.f62021e.b(i10, this.f62020c, c22);
                        }
                    }
                    this.f62021e.setCount(min);
                    this.f62021e.a(true);
                }
            }
        }
    }
}
