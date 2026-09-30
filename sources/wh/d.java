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
    public final m2 f45354a;
    public final TLRPC.Chat f45355b;
    public final int f45356c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45357f;
    public TextView f45358g;
    public ImageView h;
    public b f45359i;
    public TLRPC.ChatFull f45360j;
    public int f45361k;
    public int f45362l = -1;
    public c f45363m;

    public d(TLRPC.Chat chat, m2 m2Var) {
        this.f45354a = m2Var;
        this.f45355b = chat;
        this.f45356c = m2Var.getCurrentAccount();
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
                int i10 = this.f45362l;
                m2 m2Var = this.f45354a;
                TLRPC.Chat chat = this.f45355b;
                if (i10 == -1 && chat != null) {
                    this.f45362l = m2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18337id);
                }
                int i11 = this.f45361k;
                int i12 = this.f45362l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18337id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45363m;
            if (cVar != null) {
                cVar.h(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new j6(this.f45358g, 4, null, null, null, null, h6.fe));
        arrayList.add(new j6(this.h, 8, null, null, null, null, h6.f19069de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            m2 m2Var = this.f45354a;
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(h6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45352b;

                {
                    this.f45352b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45352b;
                            m2 m2Var2 = dVar.f45354a;
                            if (dVar.f45359i == null) {
                                dVar.f45359i = new b(dVar, m2Var2, dVar.f45355b.f18337id);
                            }
                            m2Var2.showDialog(dVar.f45359i);
                            return;
                        default:
                            d dVar2 = this.f45352b;
                            dVar2.f45354a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45355b.f18337id, dVar2.f45361k);
                            dVar2.f45362l = dVar2.f45361k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(m2Var.getParentActivity());
            this.f45357f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45357f, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, m2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.e.f25651a;
            for (int i10 = 0; i10 < j9Var.f25354c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f45357f.addView(this.e, y5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(m2Var.getParentActivity());
            this.f45358g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45358g.setGravity(16);
            this.f45358g.setSingleLine();
            this.f45358g.setText((CharSequence) null);
            this.f45358g.setTextColor(m2Var.getThemedColor(h6.fe));
            this.f45358g.setTypeface(AndroidUtilities.bold());
            this.f45357f.addView(this.f45358g, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(m2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(h6.f0(m2Var.getThemedColor(h6.f19428x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(m2Var.getThemedColor(h6.f19069de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45352b;

                {
                    this.f45352b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45352b;
                            m2 m2Var2 = dVar.f45354a;
                            if (dVar.f45359i == null) {
                                dVar.f45359i = new b(dVar, m2Var2, dVar.f45355b.f18337id);
                            }
                            m2Var2.showDialog(dVar.f45359i);
                            return;
                        default:
                            d dVar2 = this.f45352b;
                            dVar2.f45354a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45355b.f18337id, dVar2.f45361k);
                            dVar2.f45362l = dVar2.f45361k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, y5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45360j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(pe peVar) {
        this.f45363m = peVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            m2 m2Var = this.f45354a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45355b;
                if (chat != null) {
                    m2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18337id, 0);
                    this.f45362l = 0;
                }
                a(false, z10);
                this.f45361k = 0;
            } else if (this.f45361k != i10) {
                this.f45361k = i10;
                this.f45358g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = m2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45356c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
