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
import org.telegram.ui.Components.j9;
import org.telegram.ui.pe;
import w7.z5;
public final class d {
    public final o2 f50279a;
    public final TLRPC.Chat f50280b;
    public final int f50281c;
    public FrameLayout d;
    public v e;
    public LinearLayout f50282f;
    public TextView f50283g;
    public ImageView h;
    public b f50284i;
    public TLRPC.ChatFull f50285j;
    public int f50286k;
    public int f50287l = -1;
    public c f50288m;

    public d(TLRPC.Chat chat, o2 o2Var) {
        this.f50279a = o2Var;
        this.f50280b = chat;
        this.f50281c = o2Var.getCurrentAccount();
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
                int i10 = this.f50287l;
                o2 o2Var = this.f50279a;
                TLRPC.Chat chat = this.f50280b;
                if (i10 == -1 && chat != null) {
                    this.f50287l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20343id);
                }
                int i11 = this.f50286k;
                int i12 = this.f50287l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20343id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f50288m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            o2 o2Var = this.f50279a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(k6.M0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f50277b;

                {
                    this.f50277b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50277b;
                            o2 o2Var2 = dVar.f50279a;
                            if (dVar.f50284i == null) {
                                dVar.f50284i = new b(dVar, o2Var2, dVar.f50280b.f20343id);
                            }
                            o2Var2.showDialog(dVar.f50284i);
                            return;
                        default:
                            d dVar2 = this.f50277b;
                            dVar2.f50279a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50280b.f20343id, dVar2.f50286k);
                            dVar2.f50287l = dVar2.f50286k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f50282f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f50282f, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, o2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.e.f27954a;
            for (int i10 = 0; i10 < j9Var.f27611c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f50282f.addView(this.e, z5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f50283g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f50283g.setGravity(16);
            this.f50283g.setSingleLine();
            this.f50283g.setText((CharSequence) null);
            r6.W(this.f50283g, k6.f21225fe, o2Var.getResourceProvider());
            this.f50283g.setTypeface(AndroidUtilities.bold());
            this.f50282f.addView(this.f50283g, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(o2Var.getParentActivity());
            int i11 = k6.f21554x7;
            int themedColor = o2Var.getThemedColor(i11);
            y g02 = k6.g0(436207615 & themedColor, 1, AndroidUtilities.dp(14.0f));
            if ((themedColor >>> 24) == 255) {
                r6.S(this.h, g02, null, r6.h(i11, 25), o2Var.getResourceProvider());
            } else {
                this.h.setBackground(g02);
            }
            r6.t(this.h, k6.f21189de, o2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f50277b;

                {
                    this.f50277b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50277b;
                            o2 o2Var2 = dVar.f50279a;
                            if (dVar.f50284i == null) {
                                dVar.f50284i = new b(dVar, o2Var2, dVar.f50280b.f20343id);
                            }
                            o2Var2.showDialog(dVar.f50284i);
                            return;
                        default:
                            d dVar2 = this.f50277b;
                            dVar2.f50279a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50280b.f20343id, dVar2.f50286k);
                            dVar2.f50287l = dVar2.f50286k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, z5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f50285j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(pe peVar) {
        this.f50288m = peVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f50279a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f50280b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20343id, 0);
                    this.f50287l = 0;
                }
                a(false, z10);
                this.f50286k = 0;
            } else if (this.f50286k != i10) {
                this.f50286k = i10;
                this.f50283g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f50281c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
