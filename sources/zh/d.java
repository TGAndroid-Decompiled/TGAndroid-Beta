package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ei.v;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.w8;
import org.telegram.ui.de;
public final class d {
    public final d2 f60549a;
    public final TLRPC.Chat f60550b;
    public final int f60551c;
    public FrameLayout d;
    public v f60552e;
    public LinearLayout f60553f;
    public TextView f60554g;
    public ImageView h;
    public b f60555i;
    public TLRPC.ChatFull f60556j;
    public int f60557k;
    public int f60558l = -1;
    public c f60559m;

    public d(TLRPC.Chat chat, d2 d2Var) {
        this.f60549a = d2Var;
        this.f60550b = chat;
        this.f60551c = d2Var.getCurrentAccount();
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
                int i3 = this.f60558l;
                d2 d2Var = this.f60549a;
                TLRPC.Chat chat = this.f60550b;
                if (i3 == -1 && chat != null) {
                    hp messagesController = d2Var.getMessagesController();
                    long j10 = chat.f27001id;
                    this.f60558l = messagesController.f22999e7.getInt("chatPendingRequests" + j10, 0);
                }
                int i10 = this.f60557k;
                int i11 = this.f60558l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        d2Var.getMessagesController().E4(0, chat.f27001id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f60559m;
            if (cVar != null) {
                cVar.c(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            d2 d2Var = this.f60549a;
            FrameLayout frameLayout = new FrameLayout(d2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(k6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f60548b;

                {
                    this.f60548b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f60548b;
                            d2 d2Var2 = dVar.f60549a;
                            if (dVar.f60555i == null) {
                                dVar.f60555i = new b(dVar, d2Var2, dVar.f60550b.f27001id);
                            }
                            d2Var2.showDialog(dVar.f60555i);
                            return;
                        default:
                            d dVar2 = this.f60548b;
                            dVar2.f60549a.getMessagesController().E4(dVar2.f60557k, dVar2.f60550b.f27001id);
                            dVar2.f60558l = dVar2.f60557k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(d2Var.getParentActivity());
            this.f60553f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f60553f, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, d2Var.getParentActivity(), false);
            this.f60552e = vVar;
            vVar.setAvatarsTextSize(g0.L(18.0f));
            w8 w8Var = this.f60552e.f40266a;
            for (int i3 = 0; i3 < w8Var.f39949c.length; i3++) {
                w8Var.j(0, 0, null);
            }
            this.f60553f.addView(this.f60552e, mf.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(d2Var.getParentActivity());
            this.f60554g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f60554g.setGravity(16);
            this.f60554g.setSingleLine();
            this.f60554g.setText((CharSequence) null);
            r6.V(this.f60554g, k6.Te, d2Var.getResourceProvider());
            this.f60554g.setTypeface(g0.o());
            this.f60553f.addView(this.f60554g, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(d2Var.getParentActivity());
            int i10 = k6.f28255x7;
            int themedColor = d2Var.getThemedColor(i10);
            y h02 = k6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                r6.R(this.h, h02, null, r6.h(i10, 25), d2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            r6.t(this.h, k6.Re, d2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(bd.M0(2131752041, null));
            this.h.setImageResource(2131231983);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f60548b;

                {
                    this.f60548b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f60548b;
                            d2 d2Var2 = dVar.f60549a;
                            if (dVar.f60555i == null) {
                                dVar.f60555i = new b(dVar, d2Var2, dVar.f60550b.f27001id);
                            }
                            d2Var2.showDialog(dVar.f60555i);
                            return;
                        default:
                            d dVar2 = this.f60548b;
                            dVar2.f60549a.getMessagesController().E4(dVar2.f60557k, dVar2.f60550b.f27001id);
                            dVar2.f60558l = dVar2.f60557k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, mf.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f60556j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(de deVar) {
        this.f60559m = deVar;
    }

    public final void d(int i3, List list, boolean z10) {
        if (this.d != null) {
            d2 d2Var = this.f60549a;
            if (i3 <= 0) {
                TLRPC.Chat chat = this.f60550b;
                if (chat != null) {
                    d2Var.getMessagesController().E4(0, chat.f27001id);
                    this.f60558l = 0;
                }
                a(false, z10);
                this.f60557k = 0;
            } else if (this.f60557k != i3) {
                this.f60557k = i3;
                this.f60554g.setText(bd.G(i3, "JoinUsersRequests", new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User a22 = d2Var.getMessagesController().a2((Long) list.get(i10));
                        if (a22 != null) {
                            this.f60552e.b(i10, this.f60551c, a22);
                        }
                    }
                    this.f60552e.setCount(min);
                    this.f60552e.a(true);
                }
            }
        }
    }
}
