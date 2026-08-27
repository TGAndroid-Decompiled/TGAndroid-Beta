package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class vb implements RequestDelegate {

    public final int f43399a;

    public final yb f43400b;

    public final CountDownLatch f43401c;
    public final Runnable d;

    public vb(yb ybVar, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.f43399a = i10;
        this.f43400b = ybVar;
        this.f43401c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43399a) {
            case 0:
                final int i10 = 1;
                final yb ybVar = this.f43400b;
                final CountDownLatch countDownLatch = this.f43401c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yb ybVar2 = ybVar;
                                ArrayList arrayList = ybVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    ybVar2.J = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(ybVar2.f44753b).putUsers(tL_premium_boostsList.users, false);
                                    ybVar2.G = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            ybVar2.f44759s = Math.max(0, tL_premium_boostsList.count - i11);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && ybVar2.f44759s > 0) {
                                                z10 = true;
                                            }
                                            ybVar2.f44758r = z10;
                                            ybVar2.L = tL_premium_boostsList.count;
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                            }
                                        } else {
                                            Object obj = arrayList.get(i12);
                                            i12++;
                                            int i14 = ((TL_stories.Boost) obj).multiplier;
                                            if (i14 > 0) {
                                                i13 = i14;
                                            }
                                            i11 += i13;
                                        }
                                    }
                                }
                                break;
                            default:
                                yb ybVar3 = ybVar;
                                ArrayList arrayList2 = ybVar3.f44757n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    ybVar3.I = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(ybVar3.f44753b).putUsers(tL_premium_boostsList2.users, false);
                                    ybVar3.H = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            ybVar3.f44760w = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && ybVar3.f44760w > 0) {
                                                z11 = true;
                                            }
                                            ybVar3.v = z11;
                                            ybVar3.K = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i16);
                                            i16++;
                                            int i18 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i18 > 0) {
                                                i17 = i18;
                                            }
                                            i15 += i17;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final yb ybVar2 = this.f43400b;
                final CountDownLatch countDownLatch2 = this.f43401c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                yb ybVar3 = ybVar2;
                                ArrayList arrayList = ybVar3.h;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    ybVar3.J = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(ybVar3.f44753b).putUsers(tL_premium_boostsList.users, false);
                                    ybVar3.G = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = 1;
                                        if (i13 >= size) {
                                            ybVar3.f44759s = Math.max(0, tL_premium_boostsList.count - i12);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && ybVar3.f44759s > 0) {
                                                z10 = true;
                                            }
                                            ybVar3.f44758r = z10;
                                            ybVar3.L = tL_premium_boostsList.count;
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                            }
                                        } else {
                                            Object obj = arrayList.get(i13);
                                            i13++;
                                            int i15 = ((TL_stories.Boost) obj).multiplier;
                                            if (i15 > 0) {
                                                i14 = i15;
                                            }
                                            i12 += i14;
                                        }
                                    }
                                }
                                break;
                            default:
                                yb ybVar4 = ybVar2;
                                ArrayList arrayList2 = ybVar4.f44757n;
                                CountDownLatch countDownLatch4 = countDownLatch2;
                                if (countDownLatch4 != null) {
                                    countDownLatch4.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    ybVar4.I = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(ybVar4.f44753b).putUsers(tL_premium_boostsList2.users, false);
                                    ybVar4.H = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i16 = 0;
                                    int i17 = 0;
                                    while (true) {
                                        int i18 = 1;
                                        if (i17 >= size2) {
                                            ybVar4.f44760w = Math.max(0, tL_premium_boostsList2.count - i16);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && ybVar4.f44760w > 0) {
                                                z11 = true;
                                            }
                                            ybVar4.v = z11;
                                            ybVar4.K = tL_premium_boostsList2.count;
                                            Runnable runnable4 = runnable2;
                                            if (runnable4 != null) {
                                                runnable4.run();
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i17);
                                            i17++;
                                            int i19 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i19 > 0) {
                                                i18 = i19;
                                            }
                                            i16 += i18;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
