package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import fi.u;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.v8;
import org.telegram.ui.ce;
public final class d {
    public final e2 f61410a;
    public final TLRPC.Chat f61411b;
    public final int f61412c;
    public FrameLayout d;
    public u f61413e;
    public LinearLayout f61414f;
    public TextView f61415g;
    public ImageView h;
    public b f61416i;
    public TLRPC.ChatFull f61417j;
    public int f61418k;
    public int f61419l = -1;
    public c f61420m;

    public d(TLRPC.Chat chat, e2 e2Var) {
        this.f61410a = e2Var;
        this.f61411b = chat;
        this.f61412c = e2Var.getCurrentAccount();
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
                int i7 = this.f61419l;
                e2 e2Var = this.f61410a;
                TLRPC.Chat chat = this.f61411b;
                if (i7 == -1 && chat != null) {
                    np messagesController = e2Var.getMessagesController();
                    long j3 = chat.f28051id;
                    this.f61419l = messagesController.f25280f7.getInt("chatPendingRequests" + j3, 0);
                }
                int i10 = this.f61418k;
                int i11 = this.f61419l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        e2Var.getMessagesController().F4(0, chat.f28051id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f61420m;
            if (cVar != null) {
                cVar.e(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            e2 e2Var = this.f61410a;
            FrameLayout frameLayout = new FrameLayout(e2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f61409b;

                {
                    this.f61409b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f61409b;
                            e2 e2Var2 = dVar.f61410a;
                            if (dVar.f61416i == null) {
                                dVar.f61416i = new b(dVar, e2Var2, dVar.f61411b.f28051id);
                            }
                            e2Var2.showDialog(dVar.f61416i);
                            return;
                        default:
                            d dVar2 = this.f61409b;
                            dVar2.f61410a.getMessagesController().F4(dVar2.f61418k, dVar2.f61411b.f28051id);
                            dVar2.f61419l = dVar2.f61418k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(e2Var.getParentActivity());
            this.f61414f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f61414f, ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            u uVar = new u(1, e2Var.getParentActivity(), false);
            this.f61413e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            v8 v8Var = this.f61413e.f41311a;
            for (int i7 = 0; i7 < v8Var.f40325c.length; i7++) {
                v8Var.j(0, 0, null);
            }
            this.f61414f.addView(this.f61413e, ja.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(e2Var.getParentActivity());
            this.f61415g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f61415g.setGravity(16);
            this.f61415g.setSingleLine();
            this.f61415g.setText((CharSequence) null);
            q6.U(this.f61415g, j6.We, e2Var.getResourceProvider());
            this.f61415g.setTypeface(g0.o());
            this.f61414f.addView(this.f61415g, ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(e2Var.getParentActivity());
            int i10 = j6.f29223x7;
            int themedColor = e2Var.getThemedColor(i10);
            y h02 = j6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                q6.Q(this.h, h02, null, q6.g(i10, 25), e2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            q6.s(this.h, j6.Ue, e2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(hd.M0(2131752041, null));
            this.h.setImageResource(2131231983);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f61409b;

                {
                    this.f61409b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f61409b;
                            e2 e2Var2 = dVar.f61410a;
                            if (dVar.f61416i == null) {
                                dVar.f61416i = new b(dVar, e2Var2, dVar.f61411b.f28051id);
                            }
                            e2Var2.showDialog(dVar.f61416i);
                            return;
                        default:
                            d dVar2 = this.f61409b;
                            dVar2.f61410a.getMessagesController().F4(dVar2.f61418k, dVar2.f61411b.f28051id);
                            dVar2.f61419l = dVar2.f61418k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, ja.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f61417j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(ce ceVar) {
        this.f61420m = ceVar;
    }

    public final void d(int i7, List list, boolean z10) {
        if (this.d != null) {
            e2 e2Var = this.f61410a;
            if (i7 <= 0) {
                TLRPC.Chat chat = this.f61411b;
                if (chat != null) {
                    e2Var.getMessagesController().F4(0, chat.f28051id);
                    this.f61419l = 0;
                }
                a(false, z10);
                this.f61418k = 0;
            } else if (this.f61418k != i7) {
                this.f61418k = i7;
                this.f61415g.setText(hd.G(i7, "JoinUsersRequests", new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User a22 = e2Var.getMessagesController().a2((Long) list.get(i10));
                        if (a22 != null) {
                            this.f61413e.b(i10, this.f61412c, a22);
                        }
                    }
                    this.f61413e.setCount(min);
                    this.f61413e.a(true);
                }
            }
        }
    }
}
