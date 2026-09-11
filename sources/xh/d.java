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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k9;
import org.telegram.ui.ve;
import w7.x5;
public final class d {
    public final n2 f49400a;
    public final TLRPC.Chat f49401b;
    public final int f49402c;
    public FrameLayout d;
    public a0 f49403e;
    public LinearLayout f49404f;
    public TextView f49405g;
    public ImageView h;
    public b f49406i;
    public TLRPC.ChatFull f49407j;
    public int f49408k;
    public int f49409l = -1;
    public c f49410m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f49400a = n2Var;
        this.f49401b = chat;
        this.f49402c = n2Var.getCurrentAccount();
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
                int i10 = this.f49409l;
                n2 n2Var = this.f49400a;
                TLRPC.Chat chat = this.f49401b;
                if (i10 == -1 && chat != null) {
                    this.f49409l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f19869id);
                }
                int i11 = this.f49408k;
                int i12 = this.f49409l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19869id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f49410m;
            if (cVar != null) {
                cVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f49405g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f20671de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f49400a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f49398b;

                {
                    this.f49398b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49398b;
                            n2 n2Var2 = dVar.f49400a;
                            if (dVar.f49406i == null) {
                                dVar.f49406i = new b(dVar, n2Var2, dVar.f49401b.f19869id);
                            }
                            n2Var2.showDialog(dVar.f49406i);
                            return;
                        default:
                            d dVar2 = this.f49398b;
                            dVar2.f49400a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49401b.f19869id, dVar2.f49408k);
                            dVar2.f49409l = dVar2.f49408k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f49404f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f49404f, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            a0 a0Var = new a0(1, n2Var.getParentActivity(), false);
            this.f49403e = a0Var;
            a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            k9 k9Var = this.f49403e.f28120a;
            for (int i10 = 0; i10 < k9Var.f27758c.length; i10++) {
                k9Var.l(0, null, 0);
            }
            this.f49404f.addView(this.f49403e, x5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f49405g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f49405g.setGravity(16);
            this.f49405g.setSingleLine();
            this.f49405g.setText((CharSequence) null);
            this.f49405g.setTextColor(n2Var.getThemedColor(j6.fe));
            this.f49405g.setTypeface(AndroidUtilities.bold());
            this.f49404f.addView(this.f49405g, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(n2Var.getThemedColor(j6.f21026x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(j6.f20671de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f49398b;

                {
                    this.f49398b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49398b;
                            n2 n2Var2 = dVar.f49400a;
                            if (dVar.f49406i == null) {
                                dVar.f49406i = new b(dVar, n2Var2, dVar.f49401b.f19869id);
                            }
                            n2Var2.showDialog(dVar.f49406i);
                            return;
                        default:
                            d dVar2 = this.f49398b;
                            dVar2.f49400a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49401b.f19869id, dVar2.f49408k);
                            dVar2.f49409l = dVar2.f49408k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, x5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f49407j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(ve veVar) {
        this.f49410m = veVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f49400a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f49401b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f19869id, 0);
                    this.f49409l = 0;
                }
                a(false, z10);
                this.f49408k = 0;
            } else if (this.f49408k != i10) {
                this.f49408k = i10;
                this.f49405g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.f49403e.b(i11, user, this.f49402c);
                        }
                    }
                    this.f49403e.setCount(min);
                    this.f49403e.a(true);
                }
            }
        }
    }
}
