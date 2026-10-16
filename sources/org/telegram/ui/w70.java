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
public final class w70 extends org.telegram.ui.Components.lm0 {
    public final Context f40884c;
    public final y70 d;

    public w70(y70 y70Var, Context context) {
        this.d = y70Var;
        this.f40884c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
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
        y70 y70Var = this.d;
        if ((i10 >= y70Var.E && i10 < y70Var.F) || i10 == y70Var.J) {
            return 0;
        }
        if (i10 != y70Var.f41769y && i10 != y70Var.H) {
            if (i10 != y70Var.f41768x && i10 != y70Var.K) {
                if (i10 != y70Var.I) {
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
        y70 y70Var = this.d;
        boolean z11 = y70Var.N;
        int i14 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        v70 v70Var = (v70) view;
                        if (y70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = y70Var.f41765r;
                        v70Var.f40601b = z12;
                        org.telegram.ui.Components.nu nuVar = v70Var.f40600a;
                        u70 u70Var = v70Var.f40603f;
                        nuVar.removeTextChangedListener(u70Var);
                        if (tL_messages_stickerSet == null) {
                            nuVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            nuVar.setText(str);
                            nuVar.setSelection(str.length());
                        }
                        nuVar.addTextChangedListener(u70Var);
                        return;
                    }
                    return;
                } else if (i10 == y70Var.H) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    m4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == y70Var.f41768x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.e9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            } else if (i10 == y70Var.K) {
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i10 != y70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.m2) y70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(y70Var.c0());
            int i15 = i10 - y70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            m8Var.d(tL_messages_stickerSet3, z10, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = y70Var.f41765r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f18943id;
            } else if (y70Var.b0(y70Var.v) != null) {
                j10 = y70Var.b0(y70Var.v).f18943id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f18943id != j10) {
                z12 = false;
            }
            m8Var.b(z12, false);
            return;
        }
        m8Var.b(false, false);
        m8Var.d(y70Var.f41765r, false, false);
        m8Var.setDeleteAction(new t60(this, 2));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f40884c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                    frameLayout = m4Var;
                } else {
                    y70 y70Var = this.d;
                    v70 v70Var = new v70(y70Var, context);
                    y70Var.O = v70Var;
                    frameLayout = v70Var;
                }
            } else {
                FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
                e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
                frameLayout = e9Var;
            }
        } else {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            frameLayout = m8Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
