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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.qe;
import w7.y5;
public final class d {
    public final n2 f45369a;
    public final TLRPC.Chat f45370b;
    public final int f45371c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45372f;
    public TextView f45373g;
    public ImageView h;
    public b f45374i;
    public TLRPC.ChatFull f45375j;
    public int f45376k;
    public int f45377l = -1;
    public c f45378m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f45369a = n2Var;
        this.f45370b = chat;
        this.f45371c = n2Var.getCurrentAccount();
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
                int i10 = this.f45377l;
                n2 n2Var = this.f45369a;
                TLRPC.Chat chat = this.f45370b;
                if (i10 == -1 && chat != null) {
                    this.f45377l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18328id);
                }
                int i11 = this.f45376k;
                int i12 = this.f45377l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18328id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45378m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f45373g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f19102de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f45369a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45367b;

                {
                    this.f45367b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45367b;
                            n2 n2Var2 = dVar.f45369a;
                            if (dVar.f45374i == null) {
                                dVar.f45374i = new b(dVar, n2Var2, dVar.f45370b.f18328id);
                            }
                            n2Var2.showDialog(dVar.f45374i);
                            return;
                        default:
                            d dVar2 = this.f45367b;
                            dVar2.f45369a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45370b.f18328id, dVar2.f45376k);
                            dVar2.f45377l = dVar2.f45376k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f45372f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45372f, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, n2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            i9 i9Var = this.e.f25302a;
            for (int i10 = 0; i10 < i9Var.f24948c.length; i10++) {
                i9Var.l(0, null, 0);
            }
            this.f45372f.addView(this.e, y5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f45373g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45373g.setGravity(16);
            this.f45373g.setSingleLine();
            this.f45373g.setText((CharSequence) null);
            this.f45373g.setTextColor(n2Var.getThemedColor(j6.fe));
            this.f45373g.setTypeface(AndroidUtilities.bold());
            this.f45372f.addView(this.f45373g, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(n2Var.getThemedColor(j6.f19461x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(j6.f19102de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45367b;

                {
                    this.f45367b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45367b;
                            n2 n2Var2 = dVar.f45369a;
                            if (dVar.f45374i == null) {
                                dVar.f45374i = new b(dVar, n2Var2, dVar.f45370b.f18328id);
                            }
                            n2Var2.showDialog(dVar.f45374i);
                            return;
                        default:
                            d dVar2 = this.f45367b;
                            dVar2.f45369a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45370b.f18328id, dVar2.f45376k);
                            dVar2.f45377l = dVar2.f45376k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, y5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45375j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(qe qeVar) {
        this.f45378m = qeVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f45369a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45370b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18328id, 0);
                    this.f45377l = 0;
                }
                a(false, z10);
                this.f45376k = 0;
            } else if (this.f45376k != i10) {
                this.f45376k = i10;
                this.f45373g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45371c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
