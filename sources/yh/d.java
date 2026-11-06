package yh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.u;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.y8;
import org.telegram.ui.fe;
public final class d {
    public final f2 f59411a;
    public final TLRPC.Chat f59412b;
    public final int f59413c;
    public FrameLayout d;
    public u f59414e;
    public LinearLayout f59415f;
    public TextView f59416g;
    public ImageView h;
    public b f59417i;
    public TLRPC.ChatFull f59418j;
    public int f59419k;
    public int f59420l = -1;
    public c f59421m;

    public d(TLRPC.Chat chat, f2 f2Var) {
        this.f59411a = f2Var;
        this.f59412b = chat;
        this.f59413c = f2Var.getCurrentAccount();
    }

    public final void a(boolean z9, boolean z10) {
        boolean z11;
        if (this.d.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 != z11) {
            if (z9) {
                int i7 = this.f59420l;
                f2 f2Var = this.f59411a;
                TLRPC.Chat chat = this.f59412b;
                if (i7 == -1 && chat != null) {
                    qp messagesController = f2Var.getMessagesController();
                    long j3 = chat.f26952id;
                    this.f59420l = messagesController.f24759e7.getInt("chatPendingRequests" + j3, 0);
                }
                int i10 = this.f59419k;
                int i11 = this.f59420l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        f2Var.getMessagesController().E4(0, chat.f26952id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f59421m;
            if (cVar != null) {
                cVar.d(z9, z10);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            f2 f2Var = this.f59411a;
            FrameLayout frameLayout = new FrameLayout(f2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(k6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f59410b;

                {
                    this.f59410b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f59410b;
                            f2 f2Var2 = dVar.f59411a;
                            if (dVar.f59417i == null) {
                                dVar.f59417i = new b(dVar, f2Var2, dVar.f59412b.f26952id);
                            }
                            f2Var2.showDialog(dVar.f59417i);
                            return;
                        default:
                            d dVar2 = this.f59410b;
                            dVar2.f59411a.getMessagesController().E4(dVar2.f59419k, dVar2.f59412b.f26952id);
                            dVar2.f59420l = dVar2.f59419k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(f2Var.getParentActivity());
            this.f59415f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f59415f, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            u uVar = new u(1, f2Var.getParentActivity(), false);
            this.f59414e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            y8 y8Var = this.f59414e.f40886a;
            for (int i7 = 0; i7 < y8Var.f40566c.length; i7++) {
                y8Var.j(0, 0, null);
            }
            this.f59415f.addView(this.f59414e, ha.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(f2Var.getParentActivity());
            this.f59416g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f59416g.setGravity(16);
            this.f59416g.setSingleLine();
            this.f59416g.setText((CharSequence) null);
            r6.V(this.f59416g, k6.Te, f2Var.getResourceProvider());
            this.f59416g.setTypeface(g0.o());
            this.f59415f.addView(this.f59416g, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(f2Var.getParentActivity());
            int i10 = k6.f28222x7;
            int themedColor = f2Var.getThemedColor(i10);
            y h02 = k6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                r6.R(this.h, h02, null, r6.h(i10, 25), f2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            r6.t(this.h, k6.Re, f2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(hd.M0(2131752041, null));
            this.h.setImageResource(2131231983);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f59410b;

                {
                    this.f59410b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f59410b;
                            f2 f2Var2 = dVar.f59411a;
                            if (dVar.f59417i == null) {
                                dVar.f59417i = new b(dVar, f2Var2, dVar.f59412b.f26952id);
                            }
                            f2Var2.showDialog(dVar.f59417i);
                            return;
                        default:
                            d dVar2 = this.f59410b;
                            dVar2.f59411a.getMessagesController().E4(dVar2.f59419k, dVar2.f59412b.f26952id);
                            dVar2.f59420l = dVar2.f59419k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, ha.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f59418j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(fe feVar) {
        this.f59421m = feVar;
    }

    public final void d(int i7, List list, boolean z9) {
        if (this.d != null) {
            f2 f2Var = this.f59411a;
            if (i7 <= 0) {
                TLRPC.Chat chat = this.f59412b;
                if (chat != null) {
                    f2Var.getMessagesController().E4(0, chat.f26952id);
                    this.f59420l = 0;
                }
                a(false, z9);
                this.f59419k = 0;
            } else if (this.f59419k != i7) {
                this.f59419k = i7;
                this.f59416g.setText(hd.G(i7, "JoinUsersRequests", new Object[0]));
                a(true, z9);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User a22 = f2Var.getMessagesController().a2((Long) list.get(i10));
                        if (a22 != null) {
                            this.f59414e.b(i10, this.f59413c, a22);
                        }
                    }
                    this.f59414e.setCount(min);
                    this.f59414e.a(true);
                }
            }
        }
    }
}
