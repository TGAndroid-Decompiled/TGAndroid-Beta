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
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.y8;
import org.telegram.ui.fe;
public final class d {
    public final f2 f59518a;
    public final TLRPC.Chat f59519b;
    public final int f59520c;
    public FrameLayout d;
    public u f59521e;
    public LinearLayout f59522f;
    public TextView f59523g;
    public ImageView h;
    public b f59524i;
    public TLRPC.ChatFull f59525j;
    public int f59526k;
    public int f59527l = -1;
    public c f59528m;

    public d(TLRPC.Chat chat, f2 f2Var) {
        this.f59518a = f2Var;
        this.f59519b = chat;
        this.f59520c = f2Var.getCurrentAccount();
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
                int i7 = this.f59527l;
                f2 f2Var = this.f59518a;
                TLRPC.Chat chat = this.f59519b;
                if (i7 == -1 && chat != null) {
                    qp messagesController = f2Var.getMessagesController();
                    long j3 = chat.f26956id;
                    this.f59527l = messagesController.f24774e7.getInt("chatPendingRequests" + j3, 0);
                }
                int i10 = this.f59526k;
                int i11 = this.f59527l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        f2Var.getMessagesController().E4(0, chat.f26956id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f59528m;
            if (cVar != null) {
                cVar.d(z9, z10);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            f2 f2Var = this.f59518a;
            FrameLayout frameLayout = new FrameLayout(f2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(l6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f59517b;

                {
                    this.f59517b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f59517b;
                            f2 f2Var2 = dVar.f59518a;
                            if (dVar.f59524i == null) {
                                dVar.f59524i = new b(dVar, f2Var2, dVar.f59519b.f26956id);
                            }
                            f2Var2.showDialog(dVar.f59524i);
                            return;
                        default:
                            d dVar2 = this.f59517b;
                            dVar2.f59518a.getMessagesController().E4(dVar2.f59526k, dVar2.f59519b.f26956id);
                            dVar2.f59527l = dVar2.f59526k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(f2Var.getParentActivity());
            this.f59522f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f59522f, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            u uVar = new u(1, f2Var.getParentActivity(), false);
            this.f59521e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            y8 y8Var = this.f59521e.f40934a;
            for (int i7 = 0; i7 < y8Var.f40646c.length; i7++) {
                y8Var.j(0, 0, null);
            }
            this.f59522f.addView(this.f59521e, ha.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(f2Var.getParentActivity());
            this.f59523g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f59523g.setGravity(16);
            this.f59523g.setSingleLine();
            this.f59523g.setText((CharSequence) null);
            s6.U(this.f59523g, l6.Te, f2Var.getResourceProvider());
            this.f59523g.setTypeface(g0.o());
            this.f59522f.addView(this.f59523g, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(f2Var.getParentActivity());
            int i10 = l6.f28239x7;
            int themedColor = f2Var.getThemedColor(i10);
            y h02 = l6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                s6.Q(this.h, h02, null, s6.g(i10, 25), f2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            s6.s(this.h, l6.Re, f2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(id.M0(2131752041, null));
            this.h.setImageResource(2131231983);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f59517b;

                {
                    this.f59517b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f59517b;
                            f2 f2Var2 = dVar.f59518a;
                            if (dVar.f59524i == null) {
                                dVar.f59524i = new b(dVar, f2Var2, dVar.f59519b.f26956id);
                            }
                            f2Var2.showDialog(dVar.f59524i);
                            return;
                        default:
                            d dVar2 = this.f59517b;
                            dVar2.f59518a.getMessagesController().E4(dVar2.f59526k, dVar2.f59519b.f26956id);
                            dVar2.f59527l = dVar2.f59526k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, ha.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f59525j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(fe feVar) {
        this.f59528m = feVar;
    }

    public final void d(int i7, List list, boolean z9) {
        if (this.d != null) {
            f2 f2Var = this.f59518a;
            if (i7 <= 0) {
                TLRPC.Chat chat = this.f59519b;
                if (chat != null) {
                    f2Var.getMessagesController().E4(0, chat.f26956id);
                    this.f59527l = 0;
                }
                a(false, z9);
                this.f59526k = 0;
            } else if (this.f59526k != i7) {
                this.f59526k = i7;
                this.f59523g.setText(id.G(i7, "JoinUsersRequests", new Object[0]));
                a(true, z9);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User a22 = f2Var.getMessagesController().a2((Long) list.get(i10));
                        if (a22 != null) {
                            this.f59521e.b(i10, this.f59520c, a22);
                        }
                    }
                    this.f59521e.setCount(min);
                    this.f59521e.a(true);
                }
            }
        }
    }
}
