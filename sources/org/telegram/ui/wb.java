package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wb implements RequestDelegate {
    public final int f42745a;
    public final zb f42746b;
    public final CountDownLatch f42747c;
    public final Runnable d;

    public wb(zb zbVar, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.f42745a = i10;
        this.f42746b = zbVar;
        this.f42747c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42745a) {
            case 0:
                final zb zbVar = this.f42746b;
                final CountDownLatch countDownLatch = this.f42747c;
                final Runnable runnable = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                zb zbVar2 = zbVar;
                                ArrayList arrayList = zbVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    zbVar2.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.wp.r1(zbVar2.f43875b).V3(tL_premium_boostsList.users, false);
                                    zbVar2.J = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 < size) {
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            int i13 = ((TL_stories.Boost) obj).multiplier;
                                            if (i13 > 0) {
                                                i12 = i13;
                                            }
                                            i10 += i12;
                                        } else {
                                            zbVar2.f43880s = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && zbVar2.f43880s > 0) {
                                                z10 = true;
                                            }
                                            zbVar2.f43879r = z10;
                                            zbVar2.O = tL_premium_boostsList.count;
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                zb zbVar3 = zbVar;
                                ArrayList arrayList2 = zbVar3.f43878n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    zbVar3.L = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.wp.r1(zbVar3.f43875b).V3(tL_premium_boostsList2.users, false);
                                    zbVar3.K = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 < size2) {
                                            Object obj2 = arrayList2.get(i15);
                                            i15++;
                                            int i17 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i17 > 0) {
                                                i16 = i17;
                                            }
                                            i14 += i16;
                                        } else {
                                            zbVar3.f43882x = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && zbVar3.f43882x > 0) {
                                                z11 = true;
                                            }
                                            zbVar3.f43881w = z11;
                                            zbVar3.N = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            default:
                final zb zbVar2 = this.f42746b;
                final CountDownLatch countDownLatch2 = this.f42747c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                zb zbVar22 = zbVar2;
                                ArrayList arrayList = zbVar22.h;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    zbVar22.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.wp.r1(zbVar22.f43875b).V3(tL_premium_boostsList.users, false);
                                    zbVar22.J = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 < size) {
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            int i13 = ((TL_stories.Boost) obj).multiplier;
                                            if (i13 > 0) {
                                                i12 = i13;
                                            }
                                            i10 += i12;
                                        } else {
                                            zbVar22.f43880s = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && zbVar22.f43880s > 0) {
                                                z10 = true;
                                            }
                                            zbVar22.f43879r = z10;
                                            zbVar22.O = tL_premium_boostsList.count;
                                            Runnable runnable22 = runnable2;
                                            if (runnable22 != null) {
                                                runnable22.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                zb zbVar3 = zbVar2;
                                ArrayList arrayList2 = zbVar3.f43878n;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    zbVar3.L = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.wp.r1(zbVar3.f43875b).V3(tL_premium_boostsList2.users, false);
                                    zbVar3.K = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 < size2) {
                                            Object obj2 = arrayList2.get(i15);
                                            i15++;
                                            int i17 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i17 > 0) {
                                                i16 = i17;
                                            }
                                            i14 += i16;
                                        } else {
                                            zbVar3.f43882x = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && zbVar3.f43882x > 0) {
                                                z11 = true;
                                            }
                                            zbVar3.f43881w = z11;
                                            zbVar3.N = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
        }
    }
}
