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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.l9;
import org.telegram.ui.ve;
import w7.w5;
public final class d {
    public final m2 f50629a;
    public final TLRPC.Chat f50630b;
    public final int f50631c;
    public FrameLayout d;
    public h0 f50632e;
    public LinearLayout f50633f;
    public TextView f50634g;
    public ImageView h;
    public b f50635i;
    public TLRPC.ChatFull f50636j;
    public int f50637k;
    public int f50638l = -1;
    public c f50639m;

    public d(TLRPC.Chat chat, m2 m2Var) {
        this.f50629a = m2Var;
        this.f50630b = chat;
        this.f50631c = m2Var.getCurrentAccount();
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
                int i10 = this.f50638l;
                m2 m2Var = this.f50629a;
                TLRPC.Chat chat = this.f50630b;
                if (i10 == -1 && chat != null) {
                    this.f50638l = m2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f19803id);
                }
                int i11 = this.f50637k;
                int i12 = this.f50638l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19803id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f50639m;
            if (cVar != null) {
                cVar.g(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new j6(this.f50634g, 4, null, null, null, null, h6.f20604fe));
        arrayList.add(new j6(this.h, 8, null, null, null, null, h6.f20568de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            m2 m2Var = this.f50629a;
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(h6.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f50627b;

                {
                    this.f50627b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50627b;
                            m2 m2Var2 = dVar.f50629a;
                            if (dVar.f50635i == null) {
                                dVar.f50635i = new b(dVar, m2Var2, dVar.f50630b.f19803id);
                            }
                            m2Var2.showDialog(dVar.f50635i);
                            return;
                        default:
                            d dVar2 = this.f50627b;
                            dVar2.f50629a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50630b.f19803id, dVar2.f50637k);
                            dVar2.f50638l = dVar2.f50637k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(m2Var.getParentActivity());
            this.f50633f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f50633f, w5.a(-1.0f, 0.0f, 0.0f, 100.0f, 0.0f, -1, 48));
            h0 h0Var = new h0(1, m2Var.getParentActivity(), false);
            this.f50632e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            l9 l9Var = this.f50632e.f28440a;
            for (int i10 = 0; i10 < l9Var.f28096c.length; i10++) {
                l9Var.l(0, null, 0);
            }
            this.f50633f.addView(this.f50632e, w5.a(-1.0f, 8.0f, 0.0f, 10.0f, 0.0f, -2, 48));
            TextView textView = new TextView(m2Var.getParentActivity());
            this.f50634g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f50634g.setGravity(16);
            this.f50634g.setSingleLine();
            this.f50634g.setText((CharSequence) null);
            this.f50634g.setTextColor(m2Var.getThemedColor(h6.f20604fe));
            this.f50634g.setTypeface(AndroidUtilities.bold());
            this.f50633f.addView(this.f50634g, w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            ImageView imageView = new ImageView(m2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(h6.g0(m2Var.getThemedColor(h6.f20931x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(m2Var.getThemedColor(h6.f20568de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f50627b;

                {
                    this.f50627b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f50627b;
                            m2 m2Var2 = dVar.f50629a;
                            if (dVar.f50635i == null) {
                                dVar.f50635i = new b(dVar, m2Var2, dVar.f50630b.f19803id);
                            }
                            m2Var2.showDialog(dVar.f50635i);
                            return;
                        default:
                            d dVar2 = this.f50627b;
                            dVar2.f50629a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f50630b.f19803id, dVar2.f50637k);
                            dVar2.f50638l = dVar2.f50637k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, w5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 36, 53));
            TLRPC.ChatFull chatFull = this.f50636j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(ve veVar) {
        this.f50639m = veVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            m2 m2Var = this.f50629a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f50630b;
                if (chat != null) {
                    m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19803id, 0);
                    this.f50638l = 0;
                }
                a(false, z10);
                this.f50637k = 0;
            } else if (this.f50637k != i10) {
                this.f50637k = i10;
                this.f50634g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = m2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.f50632e.b(i11, user, this.f50631c);
                        }
                    }
                    this.f50632e.setCount(min);
                    this.f50632e.a(true);
                }
            }
        }
    }
}
