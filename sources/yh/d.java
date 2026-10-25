package yh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.v;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.l9;
import org.telegram.ui.pe;
public final class d {
    public final r2 f52579a;
    public final TLRPC.Chat f52580b;
    public final int f52581c;
    public FrameLayout d;
    public v e;
    public LinearLayout f52582f;
    public TextView f52583g;
    public ImageView h;
    public b f52584i;
    public TLRPC.ChatFull f52585j;
    public int f52586k;
    public int f52587l = -1;
    public c f52588m;

    public d(TLRPC.Chat chat, r2 r2Var) {
        this.f52579a = r2Var;
        this.f52580b = chat;
        this.f52581c = r2Var.getCurrentAccount();
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
                int i10 = this.f52587l;
                r2 r2Var = this.f52579a;
                TLRPC.Chat chat = this.f52580b;
                if (i10 == -1 && chat != null) {
                    this.f52587l = r2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f22027id);
                }
                int i11 = this.f52586k;
                int i12 = this.f52587l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        r2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22027id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f52588m;
            if (cVar != null) {
                cVar.d(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            r2 r2Var = this.f52579a;
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(y6.M0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f52577b;

                {
                    this.f52577b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f52577b;
                            r2 r2Var2 = dVar.f52579a;
                            if (dVar.f52584i == null) {
                                dVar.f52584i = new b(dVar, r2Var2, dVar.f52580b.f22027id);
                            }
                            r2Var2.showDialog(dVar.f52584i);
                            return;
                        default:
                            d dVar2 = this.f52577b;
                            dVar2.f52579a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f52580b.f22027id, dVar2.f52586k);
                            dVar2.f52587l = dVar2.f52586k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(r2Var.getParentActivity());
            this.f52582f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f52582f, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, r2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            l9 l9Var = this.e.f30457a;
            for (int i10 = 0; i10 < l9Var.f30109c.length; i10++) {
                l9Var.l(0, null, 0);
            }
            this.f52582f.addView(this.e, gb1.h(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(r2Var.getParentActivity());
            this.f52583g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f52583g.setGravity(16);
            this.f52583g.setSingleLine();
            this.f52583g.setText((CharSequence) null);
            f7.V(this.f52583g, y6.f23398fe, r2Var.getResourceProvider());
            this.f52583g.setTypeface(AndroidUtilities.bold());
            this.f52582f.addView(this.f52583g, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(r2Var.getParentActivity());
            int i11 = y6.f23730x7;
            int themedColor = r2Var.getThemedColor(i11);
            y g02 = y6.g0(436207615 & themedColor, 1, AndroidUtilities.dp(14.0f));
            if ((themedColor >>> 24) == 255) {
                f7.R(this.h, g02, null, f7.h(i11, 25), r2Var.getResourceProvider());
            } else {
                this.h.setBackground(g02);
            }
            f7.t(this.h, y6.f23362de, r2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f52577b;

                {
                    this.f52577b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f52577b;
                            r2 r2Var2 = dVar.f52579a;
                            if (dVar.f52584i == null) {
                                dVar.f52584i = new b(dVar, r2Var2, dVar.f52580b.f22027id);
                            }
                            r2Var2.showDialog(dVar.f52584i);
                            return;
                        default:
                            d dVar2 = this.f52577b;
                            dVar2.f52579a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f52580b.f22027id, dVar2.f52586k);
                            dVar2.f52587l = dVar2.f52586k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, gb1.h(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f52585j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(pe peVar) {
        this.f52588m = peVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d != null) {
            r2 r2Var = this.f52579a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f52580b;
                if (chat != null) {
                    r2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22027id, 0);
                    this.f52587l = 0;
                }
                a(false, z10);
                this.f52586k = 0;
            } else if (this.f52586k != i10) {
                this.f52586k = i10;
                this.f52583g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = r2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f52581c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
