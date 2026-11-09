package sh;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g {
    public final TLRPC.TL_messageMediaPoll f55326a;
    public final TLRPC.TL_inputMediaPoll f55327b;
    public final long f55328c;
    public final String d;
    public final ArrayList f55329e;

    public g(e eVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j3, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f55328c = j3;
        this.d = str;
        this.f55329e = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f26982id = poll.f26982id;
        tL_poll.flags = poll.flags;
        tL_poll.closed = poll.closed;
        tL_poll.public_voters = poll.public_voters;
        tL_poll.multiple_choice = poll.multiple_choice;
        tL_poll.open_answers = poll.open_answers;
        tL_poll.revoting_disabled = poll.revoting_disabled;
        tL_poll.shuffle_answers = poll.shuffle_answers;
        tL_poll.subscribers_only = poll.subscribers_only;
        tL_poll.countries_iso2 = poll.countries_iso2;
        tL_poll.hide_results_until_close = poll.hide_results_until_close;
        tL_poll.creator = poll.creator;
        tL_poll.quiz = poll.quiz;
        tL_poll.answers = new ArrayList<>(tL_messageMediaPoll.poll.answers);
        ArrayList<TLRPC.PollAnswer> arrayList3 = tL_messageMediaPoll.poll.answers;
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i7);
            i7++;
            new TLRPC.TL_inputPollAnswer().text = pollAnswer.text;
        }
        TLRPC.Poll poll2 = tL_inputMediaPoll.poll;
        TLRPC.Poll poll3 = tL_messageMediaPoll.poll;
        poll2.question = poll3.question;
        poll2.close_period = poll3.close_period;
        poll2.close_date = poll3.close_date;
        poll2.hash = poll3.hash;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_inputMediaPoll.solution = pollResults2.solution;
            tL_inputMediaPoll.solution_entities = pollResults2.solution_entities;
            tL_inputMediaPoll.flags |= 2;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            tL_inputMediaPoll.correct_answers = new ArrayList<>(arrayList2);
            tL_inputMediaPoll.flags |= 1;
        }
        if (eVar != null) {
            SparseArray sparseArray = eVar.f55307a;
            int size2 = sparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                d dVar = (d) sparseArray.valueAt(i10);
                if (dVar instanceof th.e) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((th.e) dVar).f56065b;
                    tL_inputMediaWebPage.optional = true;
                    e.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (dVar instanceof th.f) {
                    e.k(tL_inputMediaPoll, keyAt, cg.d.h(((th.f) dVar).f56072b));
                } else if (dVar instanceof th.h) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((th.h) dVar).f56075b;
                    tL_inputDocument.f26968id = document.f26962id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f27017id = tL_inputDocument;
                    e.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i11 = 0; i11 < size3; i11++) {
                int keyAt2 = sparseArray.keyAt(i11);
                d dVar2 = (d) sparseArray.valueAt(i11);
                if (dVar2 instanceof th.e) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((th.e) dVar2).f56065b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    e.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (dVar2 instanceof th.f) {
                    e.l(tL_messageMediaPoll, keyAt2, ((th.f) dVar2).f56072b);
                } else if (dVar2 instanceof th.h) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((th.h) dVar2).f56075b;
                    e.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.f55326a = tL_messageMediaPoll;
        this.f55327b = tL_inputMediaPoll;
    }
}
