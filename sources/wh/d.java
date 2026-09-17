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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.we;
import w7.x5;
public final class d {
    public final o2 f45097a;
    public final TLRPC.Chat f45098b;
    public final int f45099c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45100f;
    public TextView f45101g;
    public ImageView h;
    public b f45102i;
    public TLRPC.ChatFull f45103j;
    public int f45104k;
    public int f45105l = -1;
    public c f45106m;

    public d(TLRPC.Chat chat, o2 o2Var) {
        this.f45097a = o2Var;
        this.f45098b = chat;
        this.f45099c = o2Var.getCurrentAccount();
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
                int i10 = this.f45105l;
                o2 o2Var = this.f45097a;
                TLRPC.Chat chat = this.f45098b;
                if (i10 == -1 && chat != null) {
                    this.f45105l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18121id);
                }
                int i11 = this.f45104k;
                int i12 = this.f45105l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18121id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45106m;
            if (cVar != null) {
                cVar.h(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f45101g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f18870de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            o2 o2Var = this.f45097a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45095b;

                {
                    this.f45095b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45095b;
                            o2 o2Var2 = dVar.f45097a;
                            if (dVar.f45102i == null) {
                                dVar.f45102i = new b(dVar, o2Var2, dVar.f45098b.f18121id);
                            }
                            o2Var2.showDialog(dVar.f45102i);
                            return;
                        default:
                            d dVar2 = this.f45095b;
                            dVar2.f45097a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45098b.f18121id, dVar2.f45104k);
                            dVar2.f45105l = dVar2.f45104k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f45100f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45100f, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, o2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            h9 h9Var = this.e.f24897a;
            for (int i10 = 0; i10 < h9Var.f24581c.length; i10++) {
                h9Var.l(0, null, 0);
            }
            this.f45100f.addView(this.e, x5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f45101g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45101g.setGravity(16);
            this.f45101g.setSingleLine();
            this.f45101g.setText((CharSequence) null);
            this.f45101g.setTextColor(o2Var.getThemedColor(j6.fe));
            this.f45101g.setTypeface(AndroidUtilities.bold());
            this.f45100f.addView(this.f45101g, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(o2Var.getThemedColor(j6.f19228x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(o2Var.getThemedColor(j6.f18870de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45095b;

                {
                    this.f45095b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45095b;
                            o2 o2Var2 = dVar.f45097a;
                            if (dVar.f45102i == null) {
                                dVar.f45102i = new b(dVar, o2Var2, dVar.f45098b.f18121id);
                            }
                            o2Var2.showDialog(dVar.f45102i);
                            return;
                        default:
                            d dVar2 = this.f45095b;
                            dVar2.f45097a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45098b.f18121id, dVar2.f45104k);
                            dVar2.f45105l = dVar2.f45104k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, x5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45103j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(we weVar) {
        this.f45106m = weVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f45097a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45098b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18121id, 0);
                    this.f45105l = 0;
                }
                a(false, z10);
                this.f45104k = 0;
            } else if (this.f45104k != i10) {
                this.f45104k = i10;
                this.f45101g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45099c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
