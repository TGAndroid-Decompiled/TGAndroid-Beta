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
    public final n2 f45390a;
    public final TLRPC.Chat f45391b;
    public final int f45392c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45393f;
    public TextView f45394g;
    public ImageView h;
    public b f45395i;
    public TLRPC.ChatFull f45396j;
    public int f45397k;
    public int f45398l = -1;
    public c f45399m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f45390a = n2Var;
        this.f45391b = chat;
        this.f45392c = n2Var.getCurrentAccount();
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
                int i10 = this.f45398l;
                n2 n2Var = this.f45390a;
                TLRPC.Chat chat = this.f45391b;
                if (i10 == -1 && chat != null) {
                    this.f45398l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18343id);
                }
                int i11 = this.f45397k;
                int i12 = this.f45398l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18343id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45399m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f45394g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f19117de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f45390a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45388b;

                {
                    this.f45388b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45388b;
                            n2 n2Var2 = dVar.f45390a;
                            if (dVar.f45395i == null) {
                                dVar.f45395i = new b(dVar, n2Var2, dVar.f45391b.f18343id);
                            }
                            n2Var2.showDialog(dVar.f45395i);
                            return;
                        default:
                            d dVar2 = this.f45388b;
                            dVar2.f45390a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45391b.f18343id, dVar2.f45397k);
                            dVar2.f45398l = dVar2.f45397k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f45393f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45393f, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, n2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            i9 i9Var = this.e.f25325a;
            for (int i10 = 0; i10 < i9Var.f25037c.length; i10++) {
                i9Var.l(0, null, 0);
            }
            this.f45393f.addView(this.e, y5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f45394g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45394g.setGravity(16);
            this.f45394g.setSingleLine();
            this.f45394g.setText((CharSequence) null);
            this.f45394g.setTextColor(n2Var.getThemedColor(j6.fe));
            this.f45394g.setTypeface(AndroidUtilities.bold());
            this.f45393f.addView(this.f45394g, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(n2Var.getThemedColor(j6.f19476x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(j6.f19117de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45388b;

                {
                    this.f45388b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45388b;
                            n2 n2Var2 = dVar.f45390a;
                            if (dVar.f45395i == null) {
                                dVar.f45395i = new b(dVar, n2Var2, dVar.f45391b.f18343id);
                            }
                            n2Var2.showDialog(dVar.f45395i);
                            return;
                        default:
                            d dVar2 = this.f45388b;
                            dVar2.f45390a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45391b.f18343id, dVar2.f45397k);
                            dVar2.f45398l = dVar2.f45397k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, y5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45396j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(qe qeVar) {
        this.f45399m = qeVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f45390a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45391b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18343id, 0);
                    this.f45398l = 0;
                }
                a(false, z10);
                this.f45397k = 0;
            } else if (this.f45397k != i10) {
                this.f45397k = i10;
                this.f45394g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45392c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
