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
    public final r2 f52582a;
    public final TLRPC.Chat f52583b;
    public final int f52584c;
    public FrameLayout d;
    public v e;
    public LinearLayout f52585f;
    public TextView f52586g;
    public ImageView h;
    public b f52587i;
    public TLRPC.ChatFull f52588j;
    public int f52589k;
    public int f52590l = -1;
    public c f52591m;

    public d(TLRPC.Chat chat, r2 r2Var) {
        this.f52582a = r2Var;
        this.f52583b = chat;
        this.f52584c = r2Var.getCurrentAccount();
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
                int i10 = this.f52590l;
                r2 r2Var = this.f52582a;
                TLRPC.Chat chat = this.f52583b;
                if (i10 == -1 && chat != null) {
                    this.f52590l = r2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f22027id);
                }
                int i11 = this.f52589k;
                int i12 = this.f52590l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        r2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22027id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f52591m;
            if (cVar != null) {
                cVar.d(z10, z11);
            }
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            r2 r2Var = this.f52582a;
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(y6.M0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f52580b;

                {
                    this.f52580b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f52580b;
                            r2 r2Var2 = dVar.f52582a;
                            if (dVar.f52587i == null) {
                                dVar.f52587i = new b(dVar, r2Var2, dVar.f52583b.f22027id);
                            }
                            r2Var2.showDialog(dVar.f52587i);
                            return;
                        default:
                            d dVar2 = this.f52580b;
                            dVar2.f52582a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f52583b.f22027id, dVar2.f52589k);
                            dVar2.f52590l = dVar2.f52589k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(r2Var.getParentActivity());
            this.f52585f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f52585f, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, r2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            l9 l9Var = this.e.f30459a;
            for (int i10 = 0; i10 < l9Var.f30111c.length; i10++) {
                l9Var.l(0, null, 0);
            }
            this.f52585f.addView(this.e, gb1.h(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(r2Var.getParentActivity());
            this.f52586g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f52586g.setGravity(16);
            this.f52586g.setSingleLine();
            this.f52586g.setText((CharSequence) null);
            f7.V(this.f52586g, y6.f23400fe, r2Var.getResourceProvider());
            this.f52586g.setTypeface(AndroidUtilities.bold());
            this.f52585f.addView(this.f52586g, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(r2Var.getParentActivity());
            int i11 = y6.f23732x7;
            int themedColor = r2Var.getThemedColor(i11);
            y g02 = y6.g0(436207615 & themedColor, 1, AndroidUtilities.dp(14.0f));
            if ((themedColor >>> 24) == 255) {
                f7.R(this.h, g02, null, f7.h(i11, 25), r2Var.getResourceProvider());
            } else {
                this.h.setBackground(g02);
            }
            f7.t(this.h, y6.f23364de, r2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f52580b;

                {
                    this.f52580b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f52580b;
                            r2 r2Var2 = dVar.f52582a;
                            if (dVar.f52587i == null) {
                                dVar.f52587i = new b(dVar, r2Var2, dVar.f52583b.f22027id);
                            }
                            r2Var2.showDialog(dVar.f52587i);
                            return;
                        default:
                            d dVar2 = this.f52580b;
                            dVar2.f52582a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f52583b.f22027id, dVar2.f52589k);
                            dVar2.f52590l = dVar2.f52589k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, gb1.h(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f52588j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(pe peVar) {
        this.f52591m = peVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d != null) {
            r2 r2Var = this.f52582a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f52583b;
                if (chat != null) {
                    r2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22027id, 0);
                    this.f52590l = 0;
                }
                a(false, z10);
                this.f52589k = 0;
            } else if (this.f52589k != i10) {
                this.f52589k = i10;
                this.f52586g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = r2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f52584c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
