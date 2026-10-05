package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f46496a;
    public final long f46497b;
    public final List f46498c;

    public d(long j3, long j10, List list) {
        this.f46496a = j3;
        this.f46497b = j10;
        this.f46498c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f46496a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.s(sb2, this.f46497b, " }");
    }
}
