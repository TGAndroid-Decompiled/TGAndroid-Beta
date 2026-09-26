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
import org.telegram.ui.Components.j9;
import org.telegram.ui.pe;
import w7.y5;
public final class d {
    public final m2 f45352a;
    public final TLRPC.Chat f45353b;
    public final int f45354c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45355f;
    public TextView f45356g;
    public ImageView h;
    public b f45357i;
    public TLRPC.ChatFull f45358j;
    public int f45359k;
    public int f45360l = -1;
    public c f45361m;

    public d(TLRPC.Chat chat, m2 m2Var) {
        this.f45352a = m2Var;
        this.f45353b = chat;
        this.f45354c = m2Var.getCurrentAccount();
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
                int i10 = this.f45360l;
                m2 m2Var = this.f45352a;
                TLRPC.Chat chat = this.f45353b;
                if (i10 == -1 && chat != null) {
                    this.f45360l = m2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18335id);
                }
                int i11 = this.f45359k;
                int i12 = this.f45360l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18335id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45361m;
            if (cVar != null) {
                cVar.h(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new j6(this.f45356g, 4, null, null, null, null, h6.fe));
        arrayList.add(new j6(this.h, 8, null, null, null, null, h6.f19067de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            m2 m2Var = this.f45352a;
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(h6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45350b;

                {
                    this.f45350b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45350b;
                            m2 m2Var2 = dVar.f45352a;
                            if (dVar.f45357i == null) {
                                dVar.f45357i = new b(dVar, m2Var2, dVar.f45353b.f18335id);
                            }
                            m2Var2.showDialog(dVar.f45357i);
                            return;
                        default:
                            d dVar2 = this.f45350b;
                            dVar2.f45352a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45353b.f18335id, dVar2.f45359k);
                            dVar2.f45360l = dVar2.f45359k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(m2Var.getParentActivity());
            this.f45355f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45355f, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, m2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.e.f25710a;
            for (int i10 = 0; i10 < j9Var.f25340c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f45355f.addView(this.e, y5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(m2Var.getParentActivity());
            this.f45356g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45356g.setGravity(16);
            this.f45356g.setSingleLine();
            this.f45356g.setText((CharSequence) null);
            this.f45356g.setTextColor(m2Var.getThemedColor(h6.fe));
            this.f45356g.setTypeface(AndroidUtilities.bold());
            this.f45355f.addView(this.f45356g, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(m2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(h6.f0(m2Var.getThemedColor(h6.f19426x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(m2Var.getThemedColor(h6.f19067de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45350b;

                {
                    this.f45350b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45350b;
                            m2 m2Var2 = dVar.f45352a;
                            if (dVar.f45357i == null) {
                                dVar.f45357i = new b(dVar, m2Var2, dVar.f45353b.f18335id);
                            }
                            m2Var2.showDialog(dVar.f45357i);
                            return;
                        default:
                            d dVar2 = this.f45350b;
                            dVar2.f45352a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45353b.f18335id, dVar2.f45359k);
                            dVar2.f45360l = dVar2.f45359k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, y5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45358j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(pe peVar) {
        this.f45361m = peVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            m2 m2Var = this.f45352a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45353b;
                if (chat != null) {
                    m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18335id, 0);
                    this.f45360l = 0;
                }
                a(false, z10);
                this.f45359k = 0;
            } else if (this.f45359k != i10) {
                this.f45359k = i10;
                this.f45356g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = m2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45354c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
