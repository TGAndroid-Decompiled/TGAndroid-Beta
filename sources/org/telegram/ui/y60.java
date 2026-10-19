package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y60 extends org.telegram.ui.Components.hm0 {
    public final Context f43352c;
    public final a70 d;

    public y60(a70 a70Var, Context context) {
        this.d = a70Var;
        this.f43352c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45915f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.G;
    }

    @Override
    public final int j(int i10) {
        a70 a70Var = this.d;
        if ((i10 >= a70Var.E && i10 < a70Var.F) || i10 == a70Var.J) {
            return 0;
        }
        if (i10 != a70Var.f35293y && i10 != a70Var.H) {
            if (i10 != a70Var.f35292x && i10 != a70Var.K) {
                if (i10 != a70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13;
        a70 a70Var = this.d;
        boolean z11 = a70Var.N;
        int i14 = b1Var.f45915f;
        View view = b1Var.f45912a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        x60 x60Var = (x60) view;
                        if (a70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = a70Var.f35289r;
                        x60Var.f43103b = z12;
                        org.telegram.ui.Components.iu iuVar = x60Var.f43102a;
                        w60 w60Var = x60Var.f43105f;
                        iuVar.removeTextChangedListener(w60Var);
                        if (tL_messages_stickerSet == null) {
                            iuVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            iuVar.setText(str);
                            iuVar.setSelection(str.length());
                        }
                        iuVar.addTextChangedListener(w60Var);
                        return;
                    }
                    return;
                } else if (i10 == a70Var.H) {
                    ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    l4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == a70Var.f35292x) {
                if (z11) {
                    i12 = R.string.ChooseEmojiPackMy;
                } else {
                    i12 = R.string.ChooseStickerSetMy;
                }
                String string = LocaleController.getString(i12);
                int indexOf = string.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.n4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.d9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.d9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.d9) view).setText(string);
                return;
            } else if (i10 == a70Var.K) {
                ((org.telegram.ui.Cells.d9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        if (i10 != a70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.n2) a70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(a70Var.c0());
            int i15 = i10 - a70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l8Var.d(tL_messages_stickerSet3, z10, false);
            l8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = a70Var.f35289r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f20300id;
            } else if (a70Var.b0(a70Var.v) != null) {
                j10 = a70Var.b0(a70Var.v).f20300id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f20300id != j10) {
                z12 = false;
            }
            l8Var.b(z12, false);
            return;
        }
        l8Var.b(false, false);
        l8Var.d(a70Var.f35289r, false, false);
        l8Var.setDeleteAction(new s50(this, 3));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f43352c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                    frameLayout = l4Var;
                } else {
                    a70 a70Var = this.d;
                    x60 x60Var = new x60(a70Var, context);
                    a70Var.O = x60Var;
                    frameLayout = x60Var;
                }
            } else {
                FrameLayout d9Var = new org.telegram.ui.Cells.d9(context);
                d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20949b7));
                frameLayout = d9Var;
            }
        } else {
            FrameLayout l8Var = new org.telegram.ui.Cells.l8(context, 3);
            l8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
            frameLayout = l8Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
