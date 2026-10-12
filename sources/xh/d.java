package xh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.a0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.m9;
import org.telegram.ui.xe;
import w7.a6;
public final class d {
    public final m2 f48443a;
    public final TLRPC.Chat f48444b;
    public final int f48445c;
    public FrameLayout d;
    public a0 e;
    public LinearLayout f48446f;
    public TextView f48447g;
    public ImageView h;
    public b f48448i;
    public TLRPC.ChatFull f48449j;
    public int f48450k;
    public int f48451l = -1;
    public c f48452m;

    public d(TLRPC.Chat chat, m2 m2Var) {
        this.f48443a = m2Var;
        this.f48444b = chat;
        this.f48445c = m2Var.getCurrentAccount();
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
                int i10 = this.f48451l;
                m2 m2Var = this.f48443a;
                TLRPC.Chat chat = this.f48444b;
                if (i10 == -1 && chat != null) {
                    this.f48451l = m2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f19216id);
                }
                int i11 = this.f48450k;
                int i12 = this.f48451l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19216id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f48452m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new i6(this.f48447g, 4, null, null, null, null, g6.f19943fe));
        arrayList.add(new i6(this.h, 8, null, null, null, null, g6.f19907de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            m2 m2Var = this.f48443a;
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(g6.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f48441b;

                {
                    this.f48441b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f48441b;
                            m2 m2Var2 = dVar.f48443a;
                            if (dVar.f48448i == null) {
                                dVar.f48448i = new b(dVar, m2Var2, dVar.f48444b.f19216id);
                            }
                            m2Var2.showDialog(dVar.f48448i);
                            return;
                        default:
                            d dVar2 = this.f48441b;
                            dVar2.f48443a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f48444b.f19216id, dVar2.f48450k);
                            dVar2.f48451l = dVar2.f48450k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(m2Var.getParentActivity());
            this.f48446f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f48446f, a6.a(-1.0f, 0.0f, 0.0f, 100.0f, 0.0f, -1, 48));
            a0 a0Var = new a0(1, m2Var.getParentActivity(), false);
            this.e = a0Var;
            a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            m9 m9Var = this.e.f27627a;
            for (int i10 = 0; i10 < m9Var.f27308c.length; i10++) {
                m9Var.l(0, null, 0);
            }
            this.f48446f.addView(this.e, a6.a(-1.0f, 8.0f, 0.0f, 10.0f, 0.0f, -2, 48));
            TextView textView = new TextView(m2Var.getParentActivity());
            this.f48447g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f48447g.setGravity(16);
            this.f48447g.setSingleLine();
            this.f48447g.setText((CharSequence) null);
            this.f48447g.setTextColor(m2Var.getThemedColor(g6.f19943fe));
            this.f48447g.setTypeface(AndroidUtilities.bold());
            this.f48446f.addView(this.f48447g, a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            ImageView imageView = new ImageView(m2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(g6.g0(m2Var.getThemedColor(g6.f20271x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(m2Var.getThemedColor(g6.f19907de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f48441b;

                {
                    this.f48441b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f48441b;
                            m2 m2Var2 = dVar.f48443a;
                            if (dVar.f48448i == null) {
                                dVar.f48448i = new b(dVar, m2Var2, dVar.f48444b.f19216id);
                            }
                            m2Var2.showDialog(dVar.f48448i);
                            return;
                        default:
                            d dVar2 = this.f48441b;
                            dVar2.f48443a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f48444b.f19216id, dVar2.f48450k);
                            dVar2.f48451l = dVar2.f48450k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, a6.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 36, 53));
            TLRPC.ChatFull chatFull = this.f48449j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(xe xeVar) {
        this.f48452m = xeVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            m2 m2Var = this.f48443a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f48444b;
                if (chat != null) {
                    m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19216id, 0);
                    this.f48451l = 0;
                }
                a(false, z10);
                this.f48450k = 0;
            } else if (this.f48450k != i10) {
                this.f48450k = i10;
                this.f48447g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = m2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f48445c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
