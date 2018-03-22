#pragma once
#include <string>
#include "Score.h"
#include "Sink.h"	

using namespace std;
namespace Snooker
{
	class Snooker
	{
	public:
		void AddPlayer(string name);

		string RecordMiss(string playerName);
		int RecordShot(string playerName, Sink shotResult);

		Score* GetScore();

	};
}

