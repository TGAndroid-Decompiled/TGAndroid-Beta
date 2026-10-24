package xh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.v;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.h9;
import org.telegram.ui.pe;
import w7.z5;
public final class d {
    public final o2 f50278a;
    public final TLRPC.Chat f50279b;
    public final int f50280c;
    public FrameLayout d;
    public v e;
    public LinearLayout f50281f;
    public TextView f50282g;
    public ImageView h;
    public b f50283i;
    public TLRPC.ChatFull f50284j;
    public int f50285k;
    public int f50286l = -1;
    public c f50287m;

    public d(TLRPC.Chat chat, o2 o2Var) {
        this.f50278a = o2Var;
        this.f50279b = chat;
        this.f50280c = o2Var.getCurrentAccount();
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
                int i10 = this.f50286l;
                o2 o2Var = this.f50278a;
                TLRPC.Chat chat = this.f50279b;
                if (i10 == -1 && chat != null) {
                    this.f50286l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20344id);
                }
                int i11 = this.f50285k;
                int i12 = this.f50286l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20344id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f50287m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            o2 o2Var = this.f50278a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(k6.M0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f50276b;

                {
                    this.f50276b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50276b;
                            o2 o2Var2 = dVar.f50278a;
                            if (dVar.f50283i == null) {
                                dVar.f50283i = new b(dVar, o2Var2, dVar.f50279b.f20344id);
                            }
                            o2Var2.showDialog(dVar.f50283i);
                            return;
                        default:
                            d dVar2 = this.f50276b;
                            dVar2.f50278a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50279b.f20344id, dVar2.f50285k);
                            dVar2.f50286l = dVar2.f50285k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f50281f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f50281f, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, o2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            h9 h9Var = this.e.f27369a;
            for (int i10 = 0; i10 < h9Var.f26948c.length; i10++) {
                h9Var.l(0, null, 0);
            }
            this.f50281f.addView(this.e, z5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f50282g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f50282g.setGravity(16);
            this.f50282g.setSingleLine();
            this.f50282g.setText((CharSequence) null);
            r6.W(this.f50282g, k6.f21226fe, o2Var.getResourceProvider());
            this.f50282g.setTypeface(AndroidUtilities.bold());
            this.f50281f.addView(this.f50282g, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(o2Var.getParentActivity());
            int i11 = k6.f21555x7;
            int themedColor = o2Var.getThemedColor(i11);
            y g02 = k6.g0(436207615 & themedColor, 1, AndroidUtilities.dp(14.0f));
            if ((themedColor >>> 24) == 255) {
                r6.S(this.h, g02, null, r6.h(i11, 25), o2Var.getResourceProvider());
            } else {
                this.h.setBackground(g02);
            }
            r6.t(this.h, k6.f21190de, o2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f50276b;

                {
                    this.f50276b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50276b;
                            o2 o2Var2 = dVar.f50278a;
                            if (dVar.f50283i == null) {
                                dVar.f50283i = new b(dVar, o2Var2, dVar.f50279b.f20344id);
                            }
                            o2Var2.showDialog(dVar.f50283i);
                            return;
                        default:
                            d dVar2 = this.f50276b;
                            dVar2.f50278a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50279b.f20344id, dVar2.f50285k);
                            dVar2.f50286l = dVar2.f50285k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, z5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f50284j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(pe peVar) {
        this.f50287m = peVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f50278a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f50279b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20344id, 0);
                    this.f50286l = 0;
                }
                a(false, z10);
                this.f50285k = 0;
            } else if (this.f50285k != i10) {
                this.f50285k = i10;
                this.f50282g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f50280c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
