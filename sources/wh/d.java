package wh;

import ai.h0;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.l9;
import org.telegram.ui.re;
import w7.x5;
public final class d {
    public final n2 f50436a;
    public final TLRPC.Chat f50437b;
    public final int f50438c;
    public FrameLayout d;
    public h0 f50439e;
    public LinearLayout f50440f;
    public TextView f50441g;
    public ImageView h;
    public b f50442i;
    public TLRPC.ChatFull f50443j;
    public int f50444k;
    public int f50445l = -1;
    public c f50446m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f50436a = n2Var;
        this.f50437b = chat;
        this.f50438c = n2Var.getCurrentAccount();
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
                int i10 = this.f50445l;
                n2 n2Var = this.f50436a;
                TLRPC.Chat chat = this.f50437b;
                if (i10 == -1 && chat != null) {
                    this.f50445l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20042id);
                }
                int i11 = this.f50444k;
                int i12 = this.f50445l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20042id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f50446m;
            if (cVar != null) {
                cVar.g(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new k6(this.f50441g, 4, null, null, null, null, i6.f20845fe));
        arrayList.add(new k6(this.h, 8, null, null, null, null, i6.f20809de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f50436a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(i6.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f50434b;

                {
                    this.f50434b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50434b;
                            n2 n2Var2 = dVar.f50436a;
                            if (dVar.f50442i == null) {
                                dVar.f50442i = new b(dVar, n2Var2, dVar.f50437b.f20042id);
                            }
                            n2Var2.showDialog(dVar.f50442i);
                            return;
                        default:
                            d dVar2 = this.f50434b;
                            dVar2.f50436a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50437b.f20042id, dVar2.f50444k);
                            dVar2.f50445l = dVar2.f50444k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f50440f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f50440f, x5.a(-1.0f, 0.0f, 0.0f, 100.0f, 0.0f, -1, 48));
            h0 h0Var = new h0(1, n2Var.getParentActivity(), false);
            this.f50439e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            l9 l9Var = this.f50439e.f28724a;
            for (int i10 = 0; i10 < l9Var.f28251c.length; i10++) {
                l9Var.l(0, null, 0);
            }
            this.f50440f.addView(this.f50439e, x5.a(-1.0f, 8.0f, 0.0f, 10.0f, 0.0f, -2, 48));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f50441g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f50441g.setGravity(16);
            this.f50441g.setSingleLine();
            this.f50441g.setText((CharSequence) null);
            this.f50441g.setTextColor(n2Var.getThemedColor(i6.f20845fe));
            this.f50441g.setTypeface(AndroidUtilities.bold());
            this.f50440f.addView(this.f50441g, x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(i6.g0(n2Var.getThemedColor(i6.f21170x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(i6.f20809de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f50434b;

                {
                    this.f50434b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50434b;
                            n2 n2Var2 = dVar.f50436a;
                            if (dVar.f50442i == null) {
                                dVar.f50442i = new b(dVar, n2Var2, dVar.f50437b.f20042id);
                            }
                            n2Var2.showDialog(dVar.f50442i);
                            return;
                        default:
                            d dVar2 = this.f50434b;
                            dVar2.f50436a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50437b.f20042id, dVar2.f50444k);
                            dVar2.f50445l = dVar2.f50444k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, x5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 36, 53));
            TLRPC.ChatFull chatFull = this.f50443j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(re reVar) {
        this.f50446m = reVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f50436a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f50437b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20042id, 0);
                    this.f50445l = 0;
                }
                a(false, z10);
                this.f50444k = 0;
            } else if (this.f50444k != i10) {
                this.f50444k = i10;
                this.f50441g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.f50439e.b(i11, user, this.f50438c);
                        }
                    }
                    this.f50439e.setCount(min);
                    this.f50439e.a(true);
                }
            }
        }
    }
}
