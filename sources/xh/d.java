package xh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.v;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.j9;
import org.telegram.ui.re;
import w7.z5;
public final class d {
    public final n2 f49876a;
    public final TLRPC.Chat f49877b;
    public final int f49878c;
    public FrameLayout d;
    public v e;
    public LinearLayout f49879f;
    public TextView f49880g;
    public ImageView h;
    public b f49881i;
    public TLRPC.ChatFull f49882j;
    public int f49883k;
    public int f49884l = -1;
    public c f49885m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f49876a = n2Var;
        this.f49877b = chat;
        this.f49878c = n2Var.getCurrentAccount();
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
                int i10 = this.f49884l;
                n2 n2Var = this.f49876a;
                TLRPC.Chat chat = this.f49877b;
                if (i10 == -1 && chat != null) {
                    this.f49884l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20279id);
                }
                int i11 = this.f49883k;
                int i12 = this.f49884l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20279id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f49885m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new j6(this.f49880g, 4, null, null, null, null, h6.f21035fe));
        arrayList.add(new j6(this.h, 8, null, null, null, null, h6.f20999de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f49876a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(h6.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f49874b;

                {
                    this.f49874b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49874b;
                            n2 n2Var2 = dVar.f49876a;
                            if (dVar.f49881i == null) {
                                dVar.f49881i = new b(dVar, n2Var2, dVar.f49877b.f20279id);
                            }
                            n2Var2.showDialog(dVar.f49881i);
                            return;
                        default:
                            d dVar2 = this.f49874b;
                            dVar2.f49876a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49877b.f20279id, dVar2.f49883k);
                            dVar2.f49884l = dVar2.f49883k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f49879f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f49879f, z5.a(-1.0f, 0.0f, 0.0f, 100.0f, 0.0f, -1, 48));
            v vVar = new v(1, n2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.e.f27808a;
            for (int i10 = 0; i10 < j9Var.f27458c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f49879f.addView(this.e, z5.a(-1.0f, 8.0f, 0.0f, 10.0f, 0.0f, -2, 48));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f49880g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f49880g.setGravity(16);
            this.f49880g.setSingleLine();
            this.f49880g.setText((CharSequence) null);
            this.f49880g.setTextColor(n2Var.getThemedColor(h6.f21035fe));
            this.f49880g.setTypeface(AndroidUtilities.bold());
            this.f49879f.addView(this.f49880g, z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(h6.g0(n2Var.getThemedColor(h6.f21364x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(h6.f20999de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f49874b;

                {
                    this.f49874b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49874b;
                            n2 n2Var2 = dVar.f49876a;
                            if (dVar.f49881i == null) {
                                dVar.f49881i = new b(dVar, n2Var2, dVar.f49877b.f20279id);
                            }
                            n2Var2.showDialog(dVar.f49881i);
                            return;
                        default:
                            d dVar2 = this.f49874b;
                            dVar2.f49876a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49877b.f20279id, dVar2.f49883k);
                            dVar2.f49884l = dVar2.f49883k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, z5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 36, 53));
            TLRPC.ChatFull chatFull = this.f49882j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(re reVar) {
        this.f49885m = reVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f49876a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f49877b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20279id, 0);
                    this.f49884l = 0;
                }
                a(false, z10);
                this.f49883k = 0;
            } else if (this.f49883k != i10) {
                this.f49883k = i10;
                this.f49880g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f49878c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
