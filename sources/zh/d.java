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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.d9;
import org.telegram.ui.ee;
public final class d {
    public final h2 f61976a;
    public final TLRPC.Chat f61977b;
    public final int f61978c;
    public FrameLayout d;
    public u f61979e;
    public LinearLayout f61980f;
    public TextView f61981g;
    public ImageView h;
    public b f61982i;
    public TLRPC.ChatFull f61983j;
    public int f61984k;
    public int f61985l = -1;
    public c f61986m;

    public d(TLRPC.Chat chat, h2 h2Var) {
        this.f61976a = h2Var;
        this.f61977b = chat;
        this.f61978c = h2Var.getCurrentAccount();
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
                int i7 = this.f61985l;
                h2 h2Var = this.f61976a;
                TLRPC.Chat chat = this.f61977b;
                if (i7 == -1 && chat != null) {
                    mp messagesController = h2Var.getMessagesController();
                    long j3 = chat.f28405id;
                    this.f61985l = messagesController.h7.getInt("chatPendingRequests" + j3, 0);
                }
                int i10 = this.f61984k;
                int i11 = this.f61985l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        h2Var.getMessagesController().P4(0, chat.f28405id);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f61986m;
            if (cVar != null) {
                cVar.g(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            h2 h2Var = this.f61976a;
            FrameLayout frameLayout = new FrameLayout(h2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(n6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f61975b;

                {
                    this.f61975b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f61975b;
                            h2 h2Var2 = dVar.f61976a;
                            if (dVar.f61982i == null) {
                                dVar.f61982i = new b(dVar, h2Var2, dVar.f61977b.f28405id);
                            }
                            h2Var2.showDialog(dVar.f61982i);
                            return;
                        default:
                            d dVar2 = this.f61975b;
                            dVar2.f61976a.getMessagesController().P4(dVar2.f61984k, dVar2.f61977b.f28405id);
                            dVar2.f61985l = dVar2.f61984k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(h2Var.getParentActivity());
            this.f61980f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f61980f, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            u uVar = new u(1, h2Var.getParentActivity(), false);
            this.f61979e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            d9 d9Var = this.f61979e.f34650a;
            for (int i7 = 0; i7 < d9Var.f34305c.length; i7++) {
                d9Var.j(0, 0, null);
            }
            this.f61980f.addView(this.f61979e, ma.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(h2Var.getParentActivity());
            this.f61981g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f61981g.setGravity(16);
            this.f61981g.setSingleLine();
            this.f61981g.setText((CharSequence) null);
            u6.U(this.f61981g, n6.We, h2Var.getResourceProvider());
            this.f61981g.setTypeface(g0.o());
            this.f61980f.addView(this.f61981g, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(h2Var.getParentActivity());
            int i10 = n6.f29770x7;
            int themedColor = h2Var.getThemedColor(i10);
            y h02 = n6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                u6.Q(this.h, h02, null, u6.g(i10, 25), h2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            u6.s(this.h, n6.Ue, h2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(gd.M0(2131752030, null));
            this.h.setImageResource(2131231984);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f61975b;

                {
                    this.f61975b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f61975b;
                            h2 h2Var2 = dVar.f61976a;
                            if (dVar.f61982i == null) {
                                dVar.f61982i = new b(dVar, h2Var2, dVar.f61977b.f28405id);
                            }
                            h2Var2.showDialog(dVar.f61982i);
                            return;
                        default:
                            d dVar2 = this.f61975b;
                            dVar2.f61976a.getMessagesController().P4(dVar2.f61984k, dVar2.f61977b.f28405id);
                            dVar2.f61985l = dVar2.f61984k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, ma.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f61983j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(ee eeVar) {
        this.f61986m = eeVar;
    }

    public final void d(int i7, List list, boolean z10) {
        if (this.d != null) {
            h2 h2Var = this.f61976a;
            if (i7 <= 0) {
                TLRPC.Chat chat = this.f61977b;
                if (chat != null) {
                    h2Var.getMessagesController().P4(0, chat.f28405id);
                    this.f61985l = 0;
                }
                a(false, z10);
                this.f61984k = 0;
            } else if (this.f61984k != i7) {
                this.f61984k = i7;
                this.f61981g.setText(gd.G(i7, "JoinUsersRequests", new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User c22 = h2Var.getMessagesController().c2((Long) list.get(i10));
                        if (c22 != null) {
                            this.f61979e.b(i10, this.f61978c, c22);
                        }
                    }
                    this.f61979e.setCount(min);
                    this.f61979e.a(true);
                }
            }
        }
    }
}
