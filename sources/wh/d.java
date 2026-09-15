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
import org.telegram.ui.Components.h9;
import org.telegram.ui.ue;
import w7.x5;
public final class d {
    public final n2 f45074a;
    public final TLRPC.Chat f45075b;
    public final int f45076c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45077f;
    public TextView f45078g;
    public ImageView h;
    public b f45079i;
    public TLRPC.ChatFull f45080j;
    public int f45081k;
    public int f45082l = -1;
    public c f45083m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f45074a = n2Var;
        this.f45075b = chat;
        this.f45076c = n2Var.getCurrentAccount();
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
                int i10 = this.f45082l;
                n2 n2Var = this.f45074a;
                TLRPC.Chat chat = this.f45075b;
                if (i10 == -1 && chat != null) {
                    this.f45082l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18112id);
                }
                int i11 = this.f45081k;
                int i12 = this.f45082l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18112id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45083m;
            if (cVar != null) {
                cVar.h(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new k6(this.f45078g, 4, null, null, null, null, i6.fe));
        arrayList.add(new k6(this.h, 8, null, null, null, null, i6.f18844de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f45074a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(i6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45072b;

                {
                    this.f45072b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45072b;
                            n2 n2Var2 = dVar.f45074a;
                            if (dVar.f45079i == null) {
                                dVar.f45079i = new b(dVar, n2Var2, dVar.f45075b.f18112id);
                            }
                            n2Var2.showDialog(dVar.f45079i);
                            return;
                        default:
                            d dVar2 = this.f45072b;
                            dVar2.f45074a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45075b.f18112id, dVar2.f45081k);
                            dVar2.f45082l = dVar2.f45081k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f45077f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45077f, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, n2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            h9 h9Var = this.e.f24966a;
            for (int i10 = 0; i10 < h9Var.f24617c.length; i10++) {
                h9Var.l(0, null, 0);
            }
            this.f45077f.addView(this.e, x5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f45078g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45078g.setGravity(16);
            this.f45078g.setSingleLine();
            this.f45078g.setText((CharSequence) null);
            this.f45078g.setTextColor(n2Var.getThemedColor(i6.fe));
            this.f45078g.setTypeface(AndroidUtilities.bold());
            this.f45077f.addView(this.f45078g, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(i6.f0(n2Var.getThemedColor(i6.f19202x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(i6.f18844de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45072b;

                {
                    this.f45072b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45072b;
                            n2 n2Var2 = dVar.f45074a;
                            if (dVar.f45079i == null) {
                                dVar.f45079i = new b(dVar, n2Var2, dVar.f45075b.f18112id);
                            }
                            n2Var2.showDialog(dVar.f45079i);
                            return;
                        default:
                            d dVar2 = this.f45072b;
                            dVar2.f45074a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45075b.f18112id, dVar2.f45081k);
                            dVar2.f45082l = dVar2.f45081k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, x5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45080j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(ue ueVar) {
        this.f45083m = ueVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f45074a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45075b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18112id, 0);
                    this.f45082l = 0;
                }
                a(false, z10);
                this.f45081k = 0;
            } else if (this.f45081k != i10) {
                this.f45081k = i10;
                this.f45078g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45076c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
