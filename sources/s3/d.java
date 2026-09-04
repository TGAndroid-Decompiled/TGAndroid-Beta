package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f45696a;
    public final long f45697b;
    public final List f45698c;

    public d(long j3, long j10, List list) {
        this.f45696a = j3;
        this.f45697b = j10;
        this.f45698c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f45696a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f45697b, " }");
    }
}
